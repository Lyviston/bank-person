package br.com.lyviston.person.gateway.database.repository;

import br.com.lyviston.person.domain.entity.Person;
import br.com.lyviston.person.exception.DocumentException;
import br.com.lyviston.person.gateway.database.model.PersonModel;
import br.com.lyviston.person.gateway.database.repository.dao.PersonJpaRepository;
import br.com.lyviston.person.usecase.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PersonRepositoryImp implements PersonRepository {

    private final PersonJpaRepository dao;

    @Override
    public Person save(Person person) throws Exception {
        var personModel = entityToModel(person);
        personModel = dao.save(personModel);
        return modelToentity(personModel);
    }

    @Override
    public Person findByDocument(String document) throws Exception {
        var personModel = dao.findByDocument(document);
        return modelToentity(personModel);
    }

    private PersonModel entityToModel(Person person){
        var personModel = new PersonModel(
            person.getId(),
            person.getDocument(),
            person.getName(),
            person.getCreatedAt()
        );
        return personModel;
    }
    private Person modelToentity(PersonModel personModel) throws DocumentException {
        var person = new Person(
            personModel.getId(),
            personModel.getDocument(),
            personModel.getName(),
            personModel.getCreatedAt()
        );
        return person;
    }
}
