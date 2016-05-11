package com.home;

import com.home.modules.test.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@ComponentScan
public class Application extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return  builder.sources(Application.class);
    }


    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8081);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}