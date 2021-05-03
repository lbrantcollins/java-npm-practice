package com.example.javaapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @PostMapping("/create")
    public String create() {
        return "You created me!";
    }

    @GetMapping("/read")
    public String read() {
        return "You read me!";
    }

    @PostMapping("/update")
    public String update(@RequestParam Integer id) {
        return String.format("You updated id %s!", id);
    }

    @PostMapping("/delete")
    public String delete() {
        return "You deleted me!";
    }
    
}
