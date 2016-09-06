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

    def setup() {
    }

    def "Should create very happy family with cat when single lady wants adopt"() {

    }

    def "Should create very happy family with tiger when macho wants adopt"() {

    }

    def "Should create very happy family with dog when person has undefined gender and wants adopt"() {
    }

    def "We can't create very happy family for single lady when any cats weren't in animal shelter"() {
    }
}
