package pl.upaid.repository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import pl.upaid.WorkshopTestsApplication
import spock.lang.Specification

@ContextConfiguration(classes = [WorkshopTestsApplication])
class PersonCrudSpec extends Specification {

    @Autowired
    PersonCrud personCrud

    def "Should get all persons"() {
        when:
        def persons = personCrud.getAll();

        then:
        persons.size() == 1
    }
}
