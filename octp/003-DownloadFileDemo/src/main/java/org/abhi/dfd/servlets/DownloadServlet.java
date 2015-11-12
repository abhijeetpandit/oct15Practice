package org.abhi.dfd.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadServlet
 */
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext servletContext = getServletContext();
		InputStream inputStream = servletContext.getResourceAsStream("abc.dat");
		OutputStream outputStream = response.getOutputStream();
		
		int read = 0;
		byte[] bytes = new byte[1024];
		while((read = inputStream.read(bytes)) != -1) {
			outputStream.write(bytes, 0, read);
		}
		outputStream.flush();
		outputStream.close();
	}

	
}
