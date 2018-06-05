package com.ljmelgui.di_demo.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio primario de saludo: Hola a todos!!";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo vom Hauptdienst";
    }
}
