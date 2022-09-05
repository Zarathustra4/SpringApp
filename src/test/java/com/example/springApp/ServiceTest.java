package com.example.springApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class ServiceTest {
    @Autowired
    private PersonService service;

    @Test
    void AreFunctionsWorking(){
        List<Person> listResult = service.fetchPersonList();
        assertThat(listResult).isNotNull();

        Person person = new Person("Denis", 19, "2003.06.12");
        assertThat(service.savePerson(person)).isNotNull();

        assertThat(service.findPerson(1L)).isNotNull();
    }
}
