package pl.upaid.service

import pl.upaid.domain.Animal
import pl.upaid.domain.Family
import pl.upaid.domain.Person
import pl.upaid.repository.AnimalRepository
import spock.lang.Specification

import static java.util.Optional.*
import static java.util.Optional.empty
import static pl.upaid.domain.Gender.*
import static pl.upaid.domain.Species.*

class AnimalShelterSpec extends Specification {

    AnimalRepository animalRepositoryMock
    HomeFinder animalShelter

    def setup() {
        animalRepositoryMock = Mock(AnimalRepository)
        animalShelter = new AnimalShelter(animalRepositoryMock)
    }

    def "Should create very happy family with cat when single lady wants adopt"() {
        given:
        Person singleLady = new Person(gender: FEMALE)

        when:
        Family newHappyFamily = animalShelter.findFor(singleLady).get()

        then:
        newHappyFamily.owner == singleLady
        newHappyFamily.animal.species == CAT
        animalRepositoryMock.findFirstBySpecies(CAT) >> of(new Animal(species: CAT))
    }

    def "Should create very happy family with tiger when macho wants adopt"() {
        given:
        Person macho = new Person(gender: MALE)

        when:
        Family newHappyFamily = animalShelter.findFor(macho).get()

        then:
        newHappyFamily.owner == macho
        newHappyFamily.animal.species == TIGER
        animalRepositoryMock.findFirstBySpecies(TIGER) >> of(new Animal(species: TIGER))
    }

    def "Should create very happy family with dog when person has undefined gender wants adopt"() {
        given:
        Person undefinedPerson = new Person(gender: UNDEFINED)

        when:
        Family newHappyFamily = animalShelter.findFor(undefinedPerson).get()

        then:
        newHappyFamily.owner == undefinedPerson
        newHappyFamily.animal.species == DOG
        animalRepositoryMock.findFirstBySpecies(DOG) >> of(new Animal(species: DOG))
    }

    def "We can't create very happy family for single lady when any cats weren't in animal shelter"() {
        given:
        Person singleLady = new Person(gender: FEMALE)

        when:
        Optional<Family> newHappyFamily = animalShelter.findFor(singleLady)

        then:
        newHappyFamily.isPresent() == false
        animalRepositoryMock.findFirstBySpecies(_) >> empty()
    }
}
