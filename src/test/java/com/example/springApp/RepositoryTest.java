package com.example.springApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class RepositoryTest {

    @Autowired
    private PersonRepository personRepo;

    @Test
    void isPersonExistById(){
        Person person = new Person("Tadey", 5, "2016.10.16");
        Long id = person.getId();

        personRepo.save(person);

        Optional<Person> result = personRepo.findById(id);
        assertThat(result).isNotNull();
    }
}
