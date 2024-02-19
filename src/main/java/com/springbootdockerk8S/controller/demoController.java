package com.springbootdockerk8S.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    @GetMapping("/message")
    public String getMessage(){
        return "Started the spring boot rest api application using the Docker and Kubernetes.";
    }
}

