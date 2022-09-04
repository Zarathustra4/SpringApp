package com.example.springApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void CorrectnessOfReturnMessage() throws Exception{
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/persons", String.class))
                .contains("{{\"id\":1,\"name\":\"Max\",\"age\":18,\"birthDate\":\"2004.06.02\"}}");
    }
}
