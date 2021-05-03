package com.example.javaapp.services;

import com.example.javaapp.model.MyDocument;
import com.example.javaapp.repositories.MyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    
    @Autowired
    private MyRepository repository;

    public MyDocument create(MyDocument myDocument) {

        return repository.save(myDocument);
    }


}
