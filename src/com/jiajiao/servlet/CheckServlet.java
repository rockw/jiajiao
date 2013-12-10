package com.jiajiao.servlet;

import hibernate.orm.User;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiajiao.factory.DAOFactory;

/**
 * Servlet implementation class CheckServlet
 */
@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("GBK");
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String username=request.getParameter("username");
		String email=request.getParameter("email");

		User user = new User();
		try {
			if(null != username){
				user.setUsername(username);			
				if(DAOFactory.getIUserDAOInstance().findUsername(user)){
					out.print("true");
				}else{
					out.print("false");
				}
			}
			
			if(null != email){
				user.setEmail(email);
				if(DAOFactory.getIUserDAOInstance().findEmail(user)){
					out.print("true");
				}else{
					out.print("false");
				}				
			}
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
