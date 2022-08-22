package com.example.portal;

import org.springframework.boot.CommandLineRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyCommandLineRunner implements CommandLineRunner{
    private static final Logger log = LoggerFactory.getLogger(JornalistaLoadDatabase.class);
    private JornalistaRepository repository;


    MyCommandLineRunner(JornalistaRepository jornalistaRepository){
        this.repository = jornalistaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Preloading " + this.repository.save(new Jornalista("William Boner", "12345678901", "(34)993079307")));
        log.info("Preloading " + this.repository.save(new Jornalista("Fatima Bernardes", "98765432101", "(34)915581558")));
    }
    
}
