package br.com.lyviston.person.http.dto;

import br.com.lyviston.person.domain.entity.Person;
import lombok.Getter;

import java.time.ZonedDateTime;
import java.util.UUID;

@Getter
public class CreatePersonRequest {
    private String document;
    private String name;

    public Person toEntity() throws Exception {
        return new Person(UUID.randomUUID(), this.document, this.name, ZonedDateTime.now());
    }

}
