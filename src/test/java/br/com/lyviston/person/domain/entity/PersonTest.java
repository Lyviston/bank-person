package br.com.lyviston.person.domain.entity;

import br.com.lyviston.person.exception.DocumentException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PersonTest {

    @Test
    void ShouldCreatePersonWithSuccess() throws DocumentException {
        var personId = UUID.randomUUID();
        var person = new Person(personId, "123.123.123-87", "Raimundo", LocalDateTime.now());

        assertEquals(personId, person.getId());
        /*assertThrows(
                DocumentException.class, () ->  new Person(UUID.randomUUID(), "123.123.123-87", "Raimundo", LocalDateTime.now())
        );

         */
    }

    @Test
    void ShouldThrowsAnExceptionWhenInvalidDocument(){

        assertThatThrownBy(
                ()->new Person(UUID.randomUUID(), "123.123.123-89", "Raimundo", LocalDateTime.now())).isInstanceOf(DocumentException.class);
    }
}