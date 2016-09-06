package pl.upaid.repository.rest;

import org.springframework.data.repository.CrudRepository;
import pl.upaid.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

    Person findByName(String name);
}
