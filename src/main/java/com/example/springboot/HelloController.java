package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello Spring Boot!!!!!!!!";
    }
    
    @RequestMapping("/hello_test")
    public String hello_test(){
        return "Hello hello_test!!!";
    }

}
