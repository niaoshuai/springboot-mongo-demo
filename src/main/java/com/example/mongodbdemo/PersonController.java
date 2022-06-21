package com.example.mongodbdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 *
 */
@RequestMapping("/person")
@RestController
@RequiredArgsConstructor
public class PersonController {

    private final MongoTemplate mongoTemplate;

    @PostMapping
    public Person insert(@RequestBody Person person) {
        return mongoTemplate.insert(person);
    }
}
