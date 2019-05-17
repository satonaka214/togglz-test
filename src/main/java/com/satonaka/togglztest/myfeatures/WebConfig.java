package com.satonaka.togglztest.myfeatures;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ServletConfigAware;
import org.togglz.console.TogglzConsoleServlet;
import org.togglz.core.manager.TogglzConfig;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.util.HashMap;
import java.util.Map;

//@Configuration
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

    private Map<String, String> getInitParameters() {
        Map<String, String> initParameters = new HashMap<>();

        return null;
    }

}
