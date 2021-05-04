package com.example.javaapp.controllers;

import com.example.javaapp.model.MyDocument;
import com.example.javaapp.services.MyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class MyController {

    @Autowired
    private MyService service;

    @PostMapping("/create")
    public MyDocument create(@RequestBody MyDocument myDocument) {

        return service.create(myDocument);
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
