package com.aws.test.controller;

import com.aws.test.service.TestTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloController {

    @Autowired
    private TestTService service;

    @GetMapping("/hello")
    public String hello() {
        return "hello, aws";
    }

    @GetMapping("/query")
    public String query(@RequestParam("id") Long id) {
        return "hello, "
                + service.queryName(id)
                + ", wecome to aws";
    }



}
