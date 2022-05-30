package br.com.lyviston.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.ZoneId;
import java.util.TimeZone;

@SpringBootApplication
public class PersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonApplication.class, args);
	}

	@PostConstruct
	void started(){
		TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
	}
}
