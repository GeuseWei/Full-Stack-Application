package com.todayilearned.backend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @SuppressWarnings("null")
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // 或者更具体的路径
                    .allowedOrigins("http://localhost:3000") // 允许前端应用的源
                    .allowedMethods("GET", "POST", "PUT", "DELETE") // 允许的HTTP方法
                    .allowedHeaders("*")
                    .allowCredentials(true);
            }
        };
    }
}
