package com.example.demojsf;

import jakarta.faces.webapp.FacesServlet;
import jakarta.servlet.ServletContext;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ServletContextAware;

//@Configuration
public class ApplicationConfig  {

/*    //@Bean
    public ServletRegistrationBean<FacesServlet> facesServletBean() {

        var facesServlet = new FacesServlet();
        var bean = new ServletRegistrationBean<FacesServlet>();

        bean.setServlet(legacyServlet);
        bean.addUrlMappings("*.xhtml", "/faces/*", "*.jsf");
        //bean.setLoadOnStartup(1);

        return bean;
    }*/


}
