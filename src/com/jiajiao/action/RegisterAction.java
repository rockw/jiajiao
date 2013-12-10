package com.jiajiao.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.jiajiao.actionform.LoginForm;
import com.jiajiao.actionform.RegisterForm;

public class RegisterAction extends Action {

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
    	RegisterForm registerForm = (RegisterForm)form;
        String email = registerForm.getEmail();
        String username = registerForm.getUsername();
        String password = registerForm.getPassword();
        String passwordConfirm = registerForm.getPasswordConfirm();
        
        HttpSession ses = request.getSession();
        ses.setAttribute("username", username);
        request.setAttribute("email", email);
        request.setAttribute("password", password);
        request.setAttribute("passwordConfirm", passwordConfirm);
     
        return mapping.findForward(SUCCESS);
    }
}
