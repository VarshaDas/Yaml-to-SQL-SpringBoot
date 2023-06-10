package com.varsha.yamlparser.controllers;

import com.varsha.yamlparser.models.Person;
import com.varsha.yamlparser.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping("/upload")
    public ResponseEntity<?> uploadData(@RequestParam("filepath") String filepath) {
        System.out.println("uploadData");
        this.personService.save(filepath);
        System.out.println("uploadData done");
        return ResponseEntity.ok(Map.of("message", "File uploaded"));
    }

    @GetMapping("/get")
    public List<Person> getData() {
       return this.personService.get();

    }

    @GetMapping("/test")
    public String uploadData() {
        return "abc";
    }
}
