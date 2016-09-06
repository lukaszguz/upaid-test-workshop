package pl.upaid.repository;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Resources;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import pl.upaid.domain.Person;

import java.util.Collection;

import static org.springframework.http.HttpMethod.GET;

@Repository
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonCrud {

    private RestTemplate restTemplate;

    public Collection<Person> getAll() {
        ParameterizedTypeReference listPersonType = new ParameterizedTypeReference<Resources<Person>>() {
        };

        Resources<Person> persons = (Resources<Person>) restTemplate.exchange("http://localhost:8080/persons", GET, null, listPersonType).getBody();
        return persons.getContent();
    }
}
