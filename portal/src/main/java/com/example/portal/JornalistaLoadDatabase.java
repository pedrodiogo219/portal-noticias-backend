package com.example.portal;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class JornalistaLoadDatabase {

    @Bean
    CommandLineRunner initDatabase(JornalistaRepository repository) {

    MyCommandLineRunner myCLR = new MyCommandLineRunner(repository);

    return myCLR;
    }
}