package com.example.springApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepository repository;

    public Person savePerson(Person person){
        return repository.save(person);
    }

    public List<Person> fetchPersonList(){
        return (List<Person>) repository.findAll();
    }

    public Optional<Person> findPerson(Long id){
        return repository.findById(id);
    }
}
