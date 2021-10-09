package com.expertostech.api.rest.java.controller;

import com.expertostech.api.rest.java.model.UserModel;
import com.expertostech.api.rest.java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping(path = "/api/user/{id}")
    public ResponseEntity<UserModel> getUserById(@PathVariable("id") Integer userId) {
        return repository.findById(userId)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public UserModel insertUser(@RequestBody UserModel user) {
        return repository.save(user);
    }
}
