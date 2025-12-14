package com.ecommerce.Hello;
import org.springframework.web.bind.annotation.*;

//HelloController
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
