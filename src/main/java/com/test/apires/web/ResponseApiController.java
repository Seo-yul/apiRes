package com.test.apires.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseApiController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    @GetMapping("/api/v1/echo/{words}")
    public String echo (@PathVariable String words) {
        return words;
    }
}
