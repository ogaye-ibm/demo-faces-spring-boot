package com.example.demojsf;

import com.example.demojsf.view.ViewScope;
import com.google.common.collect.ImmutableMap;
import jakarta.faces.webapp.FacesServlet;
import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.ServletContextAware;


@SpringBootApplication
public class DemoJsfMigrationApplication implements ServletContextAware {
    public static void main(String[] args) {
        SpringApplication.run(DemoJsfMigrationApplication.class, args);
    }

    @Bean
    public static CustomScopeConfigurer viewScope() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.setScopes(new ImmutableMap.Builder<String, Object>().put("view", new ViewScope()).build());
        return configurer;
    }
    @Override
    public void setServletContext(ServletContext servletContext) {
        // Faces context initialization
        // http://stackoverflow.com/a/25509937/1199132
        servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());
        servletContext.setInitParameter("faces.faces.FACELETS_SKIP_COMMENTS", "true");
    }

    @Bean
    public ServletRegistrationBean<FacesServlet> legacyServletBean() {

        var legacyServlet = new FacesServlet();
        var bean = new ServletRegistrationBean<FacesServlet>();

        bean.setServlet(legacyServlet);
        bean.addUrlMappings("*.xhtml", "/faces/*", "*.jsf");
        //bean.setLoadOnStartup(1);

        return bean;
    }
}