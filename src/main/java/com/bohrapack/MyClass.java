package com.bohrapack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
    @GetMapping("MyWebApp")
    public String sayHello(){
        return "<H1>Hello World from Lalit.</H1>";
    }
}
