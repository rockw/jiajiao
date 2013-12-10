package com.jiajiao.actionform;

import hibernate.orm.Photo;
import hibernate.orm.User;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.jiajiao.factory.DAOFactory;

public class RegisterForm extends ActionForm {
	
	private String email;
	private String username;
	private String password;
	private String passwordConfirm;
	
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
	 * @return password
	 */
	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	/**
	 * @param String
	 *            password
	 */
	public void setPasswordConfirm(String password) {
		this.passwordConfirm = password;
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
    *
    */
	public RegisterForm() {
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
		System.out.println("++++++++++++RegisterForm+++++++++++++");
		ActionErrors errors = new ActionErrors();
		System.out.println("username="+username+" password="+password+" email="+email);
		if (getUsername() == null || getUsername().length() < 6 ||getUsername().length() >12) {
			errors.add("username", new ActionMessage("errors.usernameformat"));
            System.out.println("errors.username");
			// TODO: add 'error.name.required' key to your resources
		}
		if (getPassword() == null || getPassword().length() < 6 || getPassword().length() >12 ||!getPassword().equals(getPasswordConfirm())) {
			errors.add("password", new ActionMessage("errors.password"));
			 System.out.println("errors.password");
			// TODO: add 'error.name.required' key to your resources
		}
		if (getEmail() == null || !checkEmail(getEmail())) {
			errors.add("email", new ActionMessage("errors.emailformat"));
			 System.out.println("errors.email");
			// TODO: add 'error.name.required' key to your resources
		}
		if (errors.isEmpty()) { // 用户名和密码验证通过
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			user.setEmail(email);

			try {
				if (!DAOFactory.getIUserDAOInstance().register(user)) {
					errors.add("info", new ActionMessage("errors.registererror"));
					System.out.println("errors.registererror,username已有||email已有");
				}
			} catch (Exception ex) {
				Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE,
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
}
