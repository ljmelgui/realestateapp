package com.ljmelgui.di_demo.config;

import com.greetingcompany.LanguagesGreeting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class GreetingConfiguration {

    @Bean
    public LanguagesGreeting languagesGreeting(){
        return new LanguagesGreeting();
    }
}
