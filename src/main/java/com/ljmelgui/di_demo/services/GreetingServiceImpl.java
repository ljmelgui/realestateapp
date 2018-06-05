package com.ljmelgui.di_demo.services;

public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_WORLD_MESSAGE = "Hello wold!!";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD_MESSAGE;
    }
}
