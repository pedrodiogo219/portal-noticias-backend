package com.example.portal;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/noticia")


public class NoticiaRESTController {
	@Autowired
	
	private NoticiaRepository noticRepository;
	@GetMapping

	public List<Noticia> findAllNoticias() {
	    // Implement
	  return noticRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Noticia> findNoticiaById(@PathVariable(value = "id") long id) {
		   // Implement
		  Optional<Noticia> noticia = noticRepository.findById(id);
		    if(noticia.isPresent()) {
		        return ResponseEntity.ok().body(noticia.get());
		    } else {
		        return ResponseEntity.notFound().build();
		    }
		}
	
	@PostMapping
	public Noticia saveNoticia(@Validated @RequestBody Noticia noticia) {
	    // Implement
	  return noticRepository.save(noticia);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteNoticiaById(@PathVariable(value = "id") long id) {
	   // Implement
	  Optional<Noticia> noticia = noticRepository.findById(id);
	   
	    if(noticia.isPresent()) {
	      noticRepository.deleteById(id);
	        return ResponseEntity.ok().body("Deleted");
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	
}