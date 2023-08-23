package com.javatech4u.project.util.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class StaticResourceConfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("classpath:/static/**");

        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/css/**")
                .addResourceLocations("classpath:/js/**")
                .addResourceLocations("classpath:/images/**")
                .addResourceLocations("classpath:/fonts/**")
                .addResourceLocations("classpath:/others/**");

    }
}
