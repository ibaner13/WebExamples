package com.training.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
public class AuthenticationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthenticationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("Pre Process by Authentication Filter");
		// pass the request along the filter chain
		chain.doFilter(request, response);
		System.out.println("Post Process by Authentication Filter");
		String role = (String) request.getAttribute("roles");
		System.out.println("" + role);
		RequestDispatcher dispatcher = null;
		if (role.equals("ADM")) {
			System.out.println("condition 1" + role);
			dispatcher = request.getRequestDispatcher("admin.html");

		}
		else if(role.equals("MGR")) {
			dispatcher = request.getRequestDispatcher("manager.html");

		}
		else if(role.equals("CHF")) {
			dispatcher = request.getRequestDispatcher("cheff.html");

		}
		else  if (role.equals("WTR")) {
			dispatcher = request.getRequestDispatcher("waiter.html");
		} else {
			dispatcher = request.getRequestDispatcher("login.html");
		}
		dispatcher.forward(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
