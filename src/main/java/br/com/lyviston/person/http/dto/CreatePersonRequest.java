package br.com.lyviston.person.http.dto;

import lombok.Getter;

@Getter
public class CreatePersonRequest {
    private String document;
    private String name;
}
