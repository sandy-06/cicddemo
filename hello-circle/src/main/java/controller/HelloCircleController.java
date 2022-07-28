package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCircleController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Circle CI!";
    }
}
