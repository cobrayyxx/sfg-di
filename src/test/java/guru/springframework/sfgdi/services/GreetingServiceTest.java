package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService=new GreetingServiceImpl();
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.getGreeting());
    }
}