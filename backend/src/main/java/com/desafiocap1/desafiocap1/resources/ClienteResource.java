package com.desafiocap1.desafiocap1.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafiocap1.desafiocap1.dto.ClientDTO;

@RestController
public class ClienteResource {

	@GetMapping("/clients")
	public ResponseEntity<ClientDTO> findAllPaged() {
		System.out.println("Hey, I noticed you're trying to reach clients... too bad it's not working yet, come back later");
		return ResponseEntity.ok().body(null);
		
	}
	
}
