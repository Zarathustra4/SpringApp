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

        Optional<Person> result = personRepo.findById(3L);
        assertThat(result).isNotNull();

        result = personRepo.findById(3L);
        assertThat(result).isNotNull();

        result = personRepo.findById(3L);
        assertThat(result).isNotNull();
    }
}