package pl.upaid.repository.rest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import pl.upaid.MicroserviceTestApplication
import spock.lang.Specification

@ContextConfiguration(classes = [MicroserviceTestApplication])
class PersonRepositorySpec extends Specification {

    @Autowired
    PersonRepository personRepository

    def "Should find Alice"() {
        expect:
        personRepository.findOne(1L).name == "Alice"
    }

    def "Should find person by name"() {
        expect:
        personRepository.findByName("Alice").name == "Alice"
    }
}
