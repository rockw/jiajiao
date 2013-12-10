/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiajiao.action;

import com.jiajiao.actionform.LoginForm;
import com.jiajiao.factory.DAOFactory;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author rock
 */
public class LoginAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LoginForm loginForm = (LoginForm)form;
        String userid = loginForm.getUserid();
        String email = loginForm.getEmail();
        String username = loginForm.getUsername();
        String mobile = loginForm.getMobile();
        String photo = loginForm.getPhoto();
        if(photo==null && photo.equals("")){
        	photo = "photo/defaulte.png";
        }
        
        HttpSession ses = request.getSession();
        ses.setAttribute("username", username);
        ses.setAttribute("photo", photo);
        request.setAttribute("userid", userid);
        request.setAttribute("email", email);
//        request.setAttribute("username", username);
        request.setAttribute("mobile", mobile);
//        request.setAttribute("photo", photo);
     
        return mapping.findForward(SUCCESS);
    }
}
