package com.example.javaapp.repositories;

import com.example.javaapp.model.MyDocument;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

public interface MyRepository extends CrudRepository<MyDocument, ObjectId> {
    
}
