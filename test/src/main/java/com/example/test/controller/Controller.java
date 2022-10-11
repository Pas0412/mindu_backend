package com.example.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/user")
public class Controller {

    @GetMapping("/login")
    public int login() {
        System.out.println("test");
        return 1;
    }
}
