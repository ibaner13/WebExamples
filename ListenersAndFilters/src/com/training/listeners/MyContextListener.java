package com.training.listeners;

import java.sql.*;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.training.utils.SqlConnection;


/**
 * Application Lifecycle Listener implementation class MyContextListener
 *
 */
public class MyContextListener implements ServletContextListener,ServletContextAttributeListener {

	private Connection con;
	/**
	 * Default constructor.
	 */
	public MyContextListener() {
		// TODO Auto-generated constructor stub
		con = SqlConnection.getOracleConnection();
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent event) {

		System.out.println("Context - Destroyed ********** ");
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent event) {

		String userName = event.getServletContext().getInitParameter("userName");
		String passWord = event.getServletContext().getInitParameter("passWord");
		String url = event.getServletContext().getInitParameter("url");
		System.out.println("Context - Initialized ********** " + userName + "\t" + passWord + "\t" + url);
    	event.getServletContext().setAttribute("connection", con);

	}

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Attribute Added : "+event.getServletContext().getAttributeNames());
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Attribute Added : "+event.getServletContext().getAttributeNames());
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Attribute Added : "+event.getServletContext().getAttributeNames());
	}

}
