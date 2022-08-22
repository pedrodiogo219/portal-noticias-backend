package com.example.portal;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jornalista")
public class JornalistaRESTController {
    @Autowired
    private JornalistaRepository jornalistaRepository;

    @GetMapping
    public List<Jornalista> findAllUsers() {
        // Implement
        return jornalistaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jornalista> findJornalistarById(@PathVariable(value = "id") long id) {
        // Implement
        Optional<Jornalista> jornalista = jornalistaRepository.findById(id);
        if (jornalista.isPresent()) {
            return ResponseEntity.ok().body(jornalista.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Jornalista saveJornalista(@Validated @RequestBody Jornalista jornalista) {
        // Implement
        return jornalistaRepository.save(jornalista);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJornalistaById(@PathVariable(value = "id") long id) {
        // Implement
        Optional<Jornalista> jornalista = jornalistaRepository.findById(id);
        if (jornalista.isPresent()) {
            jornalistaRepository.deleteById(id);
            return ResponseEntity.ok().body("Deleted");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}