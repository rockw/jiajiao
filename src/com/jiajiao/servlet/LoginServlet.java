/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiajiao.servlet;

import com.jiajiao.factory.DAOFactory;

import hibernate.orm.User;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author rock
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = "login.jsp";
        String loginner = request.getParameter("loginner");
        String password = request.getParameter("password");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!"+loginner);
        List<String> info = new ArrayList<String>();
        if(loginner == null ||"".equals(loginner)){
            info.add("用户名不能为空！");
        }
        if(password== null ||"".equals(password)){
             info.add("密码不能为空！");
        }
        if( info.isEmpty()){//用户名和密码验证通过
            User user = new User();
            if(loginner.length() == 11 && checkPhone(loginner)){
                user.setMobile(loginner);
            }else if(checkEmail(loginner)){
                user.setEmail(loginner);
            }else{
                user.setUsername(loginner);
            }
            user.setPassword(password);
            try{
                if(DAOFactory.getIUserDAOInstance().findLogin(user)){
                    info.add("用户登录成功，欢迎"+user.getUsername()+"光临");
                }else{
                    info.add("用户登录失败，错误的用户名和密码");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        request.setAttribute("info", info);
        request.getRequestDispatcher(path).forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    
     private boolean checkEmail(String email){
        
        Pattern pattern = Pattern.compile("^/w+([-.]/w+)*@/w+([-]/w+)*/.(/w+([-]/w+)*/.)*[a-z]{2,3}$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

      public boolean checkPhone(String phone){
        Pattern pattern = Pattern.compile("^13/d{9}||15[8,9]/d{8}$");
        Matcher matcher = pattern.matcher(phone);
        
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

}
