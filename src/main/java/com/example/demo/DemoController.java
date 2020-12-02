package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DemoController {


    @GetMapping
    public String getHello()
    {
        return "Hello Spring and Docker";
    }
    

    @GetMapping("new")
    public String getHello2()
    {
        return "Hello Spring and Docker New";
    }

}
