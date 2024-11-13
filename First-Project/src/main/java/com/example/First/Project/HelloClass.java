package com.example.First.Project;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloClass {

    @GetMapping("msg")
    public String getMessage(){
        return "Hello from Radhakrushna";
    }

    @GetMapping("rk")
    public String rkMessage() {
        return "Hello from RK";
    }
}
