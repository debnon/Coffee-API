package apilab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeController {

    @GetMapping(value = "/coffee")
    public String home() {
        return "Welcome to the Coffee API!";
    }
}