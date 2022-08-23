package com.example.portal;

import org.springframework.boot.CommandLineRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyCommandLineRunner implements CommandLineRunner{
    private static final Logger log = LoggerFactory.getLogger(JornalistaLoadDatabase.class);
    private JornalistaRepository jornalistaRepository;

    private NoticiaRepository noticiaRepository;
    
    MyCommandLineRunner(JornalistaRepository jornalistaRepository, NoticiaRepository noticiaRepository){
        this.jornalistaRepository = jornalistaRepository;
        this.noticiaRepository = noticiaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Preloading " + this.jornalistaRepository.save(new Jornalista("William Boner", "12345678901", "(34)993079307")));
        log.info("Preloading " + this.jornalistaRepository.save(new Jornalista("Fatima Bernardes", "98765432101", "(34)915581558")));

        log.info("Preloading " + this.noticiaRepository.save(new Noticia("TituloDaNoticia1", "descricaonoticia1", "corponoticia1","imagem1", 1)));
        log.info("Preloading " + this.noticiaRepository.save(new Noticia("TituloDoContato2", "descricaonoticia2", "corponoticia2","imagem1", 2)));
        log.info("Preloading " + this.noticiaRepository.save(new Noticia("TituloDoContato3", "descricaonoticia3", "corponoticia3","imagem3", 3)));   

    }
    
}
