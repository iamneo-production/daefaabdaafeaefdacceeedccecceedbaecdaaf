package com.examly.springapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "hello")
@CrossOrigin
public class TestController {
    
    @GetMapping(path = "/test")
    public String test()
    {
        return "Welcome !!";
    }

}

