package br.com.lyviston.person.gateway.database.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.ZonedDateTime;
import java.util.UUID;

@Getter
@AllArgsConstructor
@Entity
@Table(name = "person")
@NoArgsConstructor
public class PersonModel {
    @Id
    private UUID id;
    private String document;
    private String name;

    @Column(name = "created_at")
    private ZonedDateTime createdAt;
}
