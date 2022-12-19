package com.example.Deploy02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/")
public class BasicController {

    Random random = new Random();
    int num1 = random.nextInt();
    int num2 = random.nextInt();

    @GetMapping
    public int sum(){

        return num1 + num2;
    }
}
