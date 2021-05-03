package com.example.javaapp.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Document(collection="MyCollection")
@Data
@Builder 
@NoArgsConstructor
@AllArgsConstructor
public class MyDocument {

    @Id
    private ObjectId id;

    @Indexed
    private String label;
}
