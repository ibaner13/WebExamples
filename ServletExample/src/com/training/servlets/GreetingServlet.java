package com.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;


import javax.servlet.http.*;
import javax.servlet.*;

/**
 * Servlet implementation class GreetingServlet
 */
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Logger log = Logger.getLogger(this.getClass().getName());
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GreetingServlet() {
        super();
        // TODO Auto-generated constructor stub
        log.info("Constructor Called");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		log.info("Vendor - Request Object: " + request.getClass().toString());
		log.info("Vendor - Response Object: " + request.getClass().toString());
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<h1 style='text-align:center'>Welcome to Servlet Programming</h1>");
		String username = request.getParameter("userName");
	    String password =request.getParameter("passWord");
	    String tel =request.getParameter("tel");
	    String emailid =request.getParameter("email");
	    String role =request.getParameter("role"); 
	    out.println("Welcome : "+role +" : "+username); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
