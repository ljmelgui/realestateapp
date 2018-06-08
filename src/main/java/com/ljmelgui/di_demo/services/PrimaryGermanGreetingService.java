package com.ljmelgui.di_demo.services;

import com.greetingcompany.LanguagesGreeting;
import com.ljmelgui.di_demo.repositories.GreetingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

    private final LanguagesGreeting languagesGreeting;

    @Autowired
    public PrimaryGermanGreetingService(LanguagesGreeting languagesGreeting) {
        this.languagesGreeting = languagesGreeting;
    }

    @Override
    public String sayGreeting() {
        return languagesGreeting.getGermanGreeting();
    }
}
