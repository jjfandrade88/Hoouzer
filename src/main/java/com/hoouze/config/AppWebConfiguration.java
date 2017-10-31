
package com.hoouze.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.hoouze.DAO", "com.hoouze.controler", "com.hoouze.model"})
public class AppWebConfiguration extends WebMvcConfigurerAdapter {
    @Bean//Retorna o objeto que o spin vai gerenciar o objeto(Injeção de depedencia)
    public InternalResourceViewResolver internalResourceViewResolver(){
    InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
    internalResourceViewResolver.setPrefix("/WEB-INF/View/");
    internalResourceViewResolver.setSuffix(".jsp");
    return internalResourceViewResolver;
    }
    
}
