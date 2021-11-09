package com.example.mdbdemo.repos;

import com.example.mdbdemo.model.Human;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HumanRepository extends MongoRepository<Human, String> {

}
