package listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import beans.DummyDataSource;

public class MyServletContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Creating dataSource");
		ServletContext servletContext = sce.getServletContext();
		DummyDataSource dataSource = new DummyDataSource();
		dataSource.setDbUrl("URL");
		dataSource.setUserName("abhi");
		dataSource.setPassword("******");
		servletContext.setAttribute("dataSource", dataSource);
		
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Destroying dataSource");
		
	}

}
