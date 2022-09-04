package com.example.springApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(PersonRepository repository){
        return args -> {
            log.info("Preloading " + repository.save(new Person("Max", 18, "2004.06.02")));
            log.info("Preloading " + repository.save(new Person("Roman", 18, "2004.06.02")));
            log.info("Preloading " + repository.save(new Person("Marko", 18, "2004.06.02")));
        };
    }
}
