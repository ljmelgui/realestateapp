package com.ljmelgui.di_demo.repositories;

public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hallo vom Hauptdienst";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio primario de saludo: Hola a todos!!";
    }

    @Override
    public String getGermanGreeting() {
        return "Hello - Primary Greeting service";
    }
}
