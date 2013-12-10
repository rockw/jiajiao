/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiajiao.actionform;

import com.jiajiao.factory.DAOFactory;

import hibernate.orm.Photo;
import hibernate.orm.User;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * 
 * @author rock
 */
public class LoginForm extends org.apache.struts.action.ActionForm {

	private String userid;
	private String password;
	private String email;
	private String username;
	private String loginner;
	private String mobile;
	private String photo;

	/**
	 * @return userid
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * @param string
	 *            userid
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param String
	 *            password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param String
	 *            password
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return loginner
	 * 
	 *         loginner can be username|userid|email|mobile
	 */
	public String getLoginner() {
		return loginner;
	}

	/**
	 * @param loginner
	 * 
	 *            loginner can be username|userid|email|mobile
	 */
	public void setLoginner(String loginner) {
		this.loginner = loginner;
	}

	/**
	 * @return photo
	 * 
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param loginner
	 * 
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
     *
     */
	public LoginForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * This is the action called from the Struts framework.
	 * 
	 * @param mapping
	 *            The ActionMapping used to select this instance.
	 * @param request
	 *            The HTTP Request we are processing.
	 * @return
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		System.out.println("++++++++++++LoginForm+++++++++++++");

		if (getLoginner() == null || getLoginner().length() < 1) {
			errors.add("info", new ActionMessage("errors.userid"));
			// TODO: add 'error.name.required' key to your resources
		}
		if (getPassword() == null || getPassword().length() < 1) {
			errors.add("info", new ActionMessage("errors.password"));
			// TODO: add 'error.name.required' key to your resources
		}
		if (errors.isEmpty()) { // 用户名和密码验证通过
			User user = new User();
			Photo photo = new Photo();
			if (checkPhone(loginner)) {
				user.setMobile(loginner);
			} else if (checkEmail(loginner)) {
				user.setEmail(loginner);
			} else {
				user.setUsername(loginner);
			}
			user.setPassword(password);
			
			try {
				if (DAOFactory.getIUserDAOInstance().findLogin(user)) {
					// info.add("用户登录成功，欢迎"+user.getUsername()+"光临");
					setUsername(user.getUsername());
					setUserid(user.getUserid());
					setEmail(user.getEmail());
					setMobile(user.getMobile());
					photo.setUser(user);
				} else {
					errors.add("info", new ActionMessage("errors.loginerror"));
				}
				
				if(DAOFactory.IPhotoDAOInstance().findPhoto(photo)){
					setPhoto(photo.getPhoto());		
				}else{
					errors.add("info", new ActionMessage("errors.loginerror"));
				}
			} catch (Exception ex) {
				Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		}
		return errors;
	}

	private boolean checkEmail(String email) {
		Pattern pattern = Pattern.compile("^\\w+@\\w+\\.(com|cn)");
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	private boolean checkPhone(String phone) {
		boolean flag = false;
		if (phone.length() == 11) {
			for (int i = 0; i < phone.length(); i++) {//
				char c = phone.charAt(i);
				if (!Character.isDigit(c)) {//
					return false;
				}
			}
			flag = true;
		}
		return flag;
	}

}
