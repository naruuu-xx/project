package com.lou.springboot.config;

import com.lou.springboot.config.handler.TokenToUserMethodArgumentResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class SpringBootWebMvcConfigurer implements WebMvcConfigurer {

    @Autowired
    private TokenToUserMethodArgumentResolver tokenUserMethodArgumentResolver;

    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers){
        argumentResolvers.add(tokenUserMethodArgumentResolver);
    }
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/files/**").addResourceLocations("file:D:/javalearn/upload/");
    }
}
