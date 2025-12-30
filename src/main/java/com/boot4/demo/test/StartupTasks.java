package com.boot4.demo.test;


import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartupTasks {

    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationReady() {
        callYourMethodInAnotherClass();
    }

    private void callYourMethodInAnotherClass() {
         System.out.println("*** StartupTasks - callYourMethodInAnotherClass *** ");
    }
}