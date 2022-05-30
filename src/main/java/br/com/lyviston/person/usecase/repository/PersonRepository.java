package br.com.lyviston.person.usecase.repository;

import br.com.lyviston.person.domain.entity.Person;
import br.com.lyviston.person.exception.DocumentException;

public interface PersonRepository {
    Person save(Person person) throws DocumentException, Exception;
    Person findByDocument(String document) throws Exception;
}
