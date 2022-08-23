package com.example.portal;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class JornalistaLoadDatabase {

    @Bean
    CommandLineRunner initDatabase(JornalistaRepository jornalistaRepository, NoticiaRepository noticiaRepository) {
        MyCommandLineRunner myCLR = new MyCommandLineRunner(jornalistaRepository, noticiaRepository);

        return myCLR;
    }
}