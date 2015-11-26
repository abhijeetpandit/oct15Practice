package org.abhi.initDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	@Override
	public void init() throws ServletException {
		System.out.println(getServletConfig().getInitParameter("adminEmail"));
	}



	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("email2=" + getServletConfig().getInitParameter("adminEmail"));
	}

}
