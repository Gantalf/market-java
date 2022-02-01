package com.prueba.market.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/saludar")
public class HolaMundoController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hola")
    public Greeting greeting(@RequestParam(value="name", defaultValue = "world") String name){
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
