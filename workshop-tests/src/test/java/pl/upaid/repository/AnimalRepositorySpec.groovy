package pl.upaid.repository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.annotation.Rollback
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.jdbc.Sql
import org.springframework.test.context.transaction.TransactionConfiguration
import pl.upaid.WorkshopTestsApplication
import spock.lang.Specification
import spock.lang.Unroll

import javax.transaction.Transactional

import static pl.upaid.domain.Species.CAT
import static pl.upaid.domain.Species.TIGER

@ContextConfiguration(classes = [WorkshopTestsApplication])
class AnimalRepositorySpec extends Specification {

    @Autowired
    AnimalRepository animalRepository

    def "Should find any cat"() {
    }

    def "Should find any tiger"() {

    }

    def "Should find two animals"() {
    }

//    @Sql("/test.sql")
//    @Transactional
//    def "Should find three animals after update database"() {
//        expect:
//        animalRepository.findAll().size() == 3
//    }
//
//    def "Should next find two animals"() {
//        expect:
//        animalRepository.findAll().size() == 2
//    }

//    expect:
//    animalRepository.findFirstBySpecies(TIGER).get().species == TIGER
}
