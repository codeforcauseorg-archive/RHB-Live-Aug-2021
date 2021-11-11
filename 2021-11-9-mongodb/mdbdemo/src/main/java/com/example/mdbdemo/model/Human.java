package com.example.mdbdemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Human {

    @Id
    public String id;

    public String firstName;
    public String lastName;
    public List<String> tags;
    public List<Subject> subjects;

    public Human() {}

    public Human(String firstName, String lastName, List<String> tags, List<Subject> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tags = tags;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName, tags);
    }

}