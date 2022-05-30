package br.com.lyviston.person.usecase;

import br.com.lyviston.person.domain.entity.Person;
import br.com.lyviston.person.usecase.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreatePersonUsecase {

    private final PersonRepository repository;

    public Person execute(Person person) throws Exception {
        person = repository.save(person);
        return person;
    }
}
