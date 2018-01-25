package com.atsistemas.tarjetafidelidad.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class DispatcherServletInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
			
		// Create the dispatcher servlet's Spring application context
	      AnnotationConfigWebApplicationContext dispatcherContext =
	        new AnnotationConfigWebApplicationContext();
	      
	      dispatcherContext.register(WebApplicationContextConfig.class);
		
	      // Register and map the dispatcher servlet
	      ServletRegistration.Dynamic dispatcher =
	    		  servletContext.addServlet("dispatcherServlet", new DispatcherServlet(dispatcherContext));
	      dispatcher.setLoadOnStartup(1);
	      dispatcher.addMapping("/");
	}

}
