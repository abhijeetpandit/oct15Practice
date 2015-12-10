package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.DummyDataSource;

public class ListenerTester extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DummyDataSource dataSource = (DummyDataSource) getServletContext().getAttribute("dataSource");
		PrintWriter out = resp.getWriter();
		out.println("dataSource="+dataSource);
	}

}
