package com.com.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
    @GetMapping("/test/hello")
    public String hello(){
        return "Hello Spring boot";
    }
}
