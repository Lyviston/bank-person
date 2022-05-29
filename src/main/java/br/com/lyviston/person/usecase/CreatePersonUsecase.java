package br.com.lyviston.person.usecase;

import br.com.lyviston.person.domain.entity.Person;
import br.com.lyviston.person.exception.DocumentException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class CreatePersonUsecase {

    public Person execute() throws DocumentException {
        return new Person(UUID.randomUUID(), "123.123.123.87", "Raimundo da Silva", LocalDateTime.now());
    }
}
