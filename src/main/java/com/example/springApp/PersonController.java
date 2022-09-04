package com.example.springApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {
    @Autowired
    private PersonService service;

    @GetMapping("/persons")
    List<Person> all(){
        return service.fetchPersonList();
    }

    @PostMapping("/persons")
    Person newPerson(@RequestBody Person newPerson){
        return service.savePerson(newPerson);
    }

    @GetMapping("/persons/{id}")
    Optional<Person> one(@PathVariable Long id){
        return service.findPerson(id);
    }

}
