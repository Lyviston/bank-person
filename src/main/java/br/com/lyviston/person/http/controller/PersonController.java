package br.com.lyviston.person.http.controller;

import br.com.lyviston.person.exception.DocumentException;
import br.com.lyviston.person.http.dto.CreatePersonRequest;
import br.com.lyviston.person.http.dto.CreatePersonResponse;
import br.com.lyviston.person.usecase.CreatePersonUsecase;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class PersonController {

    private final CreatePersonUsecase createPersonUsecase;

    @GetMapping
    @Operation(summary = "Retorna um oi")
    public ResponseEntity<String> oi(){
        return ResponseEntity.ok("oi");
    }



    @PostMapping
    public ResponseEntity<CreatePersonResponse> createPerson(@RequestBody CreatePersonRequest personRequest) throws DocumentException {

        var result = CreatePersonResponse.fromEntity(createPersonUsecase.execute());

        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
