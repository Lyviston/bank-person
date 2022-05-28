package br.com.lyviston.person.domain.entity;

import br.com.lyviston.person.crosscutting.ValidateDocument;
import br.com.lyviston.person.exception.DocumentException;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class Person {

    private UUID id;
    private String document;
    private String name;
    private LocalDateTime createdAt;

    public Person(UUID id, String document, String name, LocalDateTime createdAt) throws DocumentException {
        this.id = id;
        this.document = document;
        this.name = name;
        this.createdAt = createdAt;
        validate();
    }
    private void validateDocument() throws DocumentException {
        ValidateDocument.execute(this.document);
    }
    private void validate() throws DocumentException {
        validateDocument();
    }
}
