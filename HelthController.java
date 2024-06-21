package com.example.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelthController {
    @GetMapping("/helth-check")
    public String HelthController(){
        return " ok ";

    }


}
