package com.satonaka.togglztest.myfeatures;

import lombok.val;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.console.TogglzConsoleServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

@Configuration
public class WebConfig {
    @Bean
    public ServletRegistrationBean<HttpServlet> togglzConsoleServlet() throws ServletException {
        val servlet = new TogglzConsoleServlet();
        ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
        servRegBean.setServlet(servlet);
        servRegBean.addUrlMappings("/togglz-console/*");
        servRegBean.setLoadOnStartup(1);
        return servRegBean;
    }

}
