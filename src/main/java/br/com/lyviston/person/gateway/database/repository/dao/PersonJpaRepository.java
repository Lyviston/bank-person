package br.com.lyviston.person.gateway.database.repository.dao;

import br.com.lyviston.person.gateway.database.model.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonJpaRepository extends JpaRepository<PersonModel, UUID> {
    PersonModel findByDocument(String document);
}
