package com.spring.consumerfeign.ureport.config;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.bstek.ureport.console.UReportServlet;

import javax.servlet.Servlet;


@ImportResource("classpath:ureport-console-context.xml")
@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages = "com.spring.consumerfeign")
public class UreportConfig {

    @Bean
    public ServletRegistrationBean<Servlet> buildUreportServlet(){
        return new ServletRegistrationBean<Servlet>(new UReportServlet(), "/ureport/*");
    }

}
