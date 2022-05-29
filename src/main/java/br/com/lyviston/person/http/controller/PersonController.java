package br.com.lyviston.person.http.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class PersonController {

    @GetMapping
    @Operation(summary = "Retorna um oi")
    public ResponseEntity<String> oi(){
        return ResponseEntity.ok("oi");
    }

    @PostMapping
    public ResponseEntity<String> ola(){
        return ResponseEntity.ok("ola");
    }
}
