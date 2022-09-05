package com.example.springApp;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringAppApplicationTests {

	@Autowired
	private PersonService service;

	@Autowired
	private PersonRepository personRepo;

	@Autowired
	private PersonController controller;
	@Test
	void contextLoads() throws Exception {
		List<Person> listResult = service.fetchPersonList();
		AssertionsForClassTypes.assertThat(listResult).isNotNull();

		Person person = new Person("Denis", 19, "2003.06.12");
		AssertionsForClassTypes.assertThat(service.savePerson(person)).isNotNull();

		AssertionsForClassTypes.assertThat(service.findPerson(1L)).isNotNull();


		Optional<Person> result = personRepo.findById(3L);
		AssertionsForClassTypes.assertThat(result).isNotNull();

		result = personRepo.findById(3L);
		AssertionsForClassTypes.assertThat(result).isNotNull();

		result = personRepo.findById(3L);
		AssertionsForClassTypes.assertThat(result).isNotNull();

		Assertions.assertThat(controller).isNotNull();

	}
}
