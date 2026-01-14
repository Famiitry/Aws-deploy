package com.mycompany.awsdeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws/api")
public class AWSController {

    @GetMapping("/hello")
    public String hello() {
        return "hello AWS - GET!!";
    }

    @PostMapping("/hello/post")
    public String helloPost() {
        return "hello AWS - POST!!";
    }
}
