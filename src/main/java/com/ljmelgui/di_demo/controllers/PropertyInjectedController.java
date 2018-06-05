package com.ljmelgui.di_demo.controllers;

import com.ljmelgui.di_demo.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
