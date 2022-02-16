package apilab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class CoffeeController {

    @GetMapping(value = "/coffeelover")
    public String coffeeLover() {
        return "I love coffee!";
    }

    @GetMapping(value = "/coffee")
    public Map coffee(@RequestParam(value = "name", defaultValue = "latte") String name) {
        if (name.equals("latte")) {
            return Collections.singletonMap("response", "I love lattes");
        }
        return Collections.singletonMap("response", "I hate lattes");
    }
}
