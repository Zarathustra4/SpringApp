package com.example.springApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringAppApplicationTests {

	@Autowired
	TestRestTemplate template;

	@LocalServerPort
	private int port;

	@Test
	void contextLoads() throws Exception {
		HttpRequestTest httpRequestTest = new HttpRequestTest();
		httpRequestTest.CorrectnessOfReturnMessage();

		RepositoryTest repositoryTest = new RepositoryTest();
		repositoryTest.isPersonExistById();

		ControllerTest controllerTest = new ControllerTest();
		controllerTest.contextLoads();
	}

}
