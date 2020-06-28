package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingServiceTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService=new ConstructorGreetingService();
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.getGreeting());
    }
}