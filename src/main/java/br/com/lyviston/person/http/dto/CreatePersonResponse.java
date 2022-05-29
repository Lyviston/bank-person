package br.com.lyviston.person.http.dto;


import br.com.lyviston.person.domain.entity.Person;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CreatePersonResponse {
    private String id;
    private String document;
    private String name;
    @JsonProperty("create_at")
    private String createdAt;

    public static CreatePersonResponse fromEntity(Person personEntity){
        return new CreatePersonResponse(
                personEntity.getId().toString(),
                personEntity.getDocument(),
                personEntity.getName(),
                personEntity.getCreatedAt().toString()
        );
    }
}
