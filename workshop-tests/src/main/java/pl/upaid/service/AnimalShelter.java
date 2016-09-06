package pl.upaid.service;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.upaid.domain.Family;
import pl.upaid.domain.Gender;
import pl.upaid.domain.Person;
import pl.upaid.domain.Species;
import pl.upaid.repository.AnimalRepository;

import java.util.Optional;

import static pl.upaid.domain.Species.*;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class AnimalShelter implements HomeFinder {

    private AnimalRepository animalRepository;

    @Override
    public Optional<Family> findFor(@NonNull Person person) {
        Species species = chooseSpieces(person.getGender());
        return animalRepository.findFirstBySpecies(species)
                .map(animal -> Family
                        .builder()
                        .animal(animal)
                        .owner(person)
                        .build()
                );
    }

    private Species chooseSpieces(Gender gender) {
        switch (gender) {
            case FEMALE:
                return CAT;
            case MALE:
                return TIGER;
            default:
                return DOG;
        }
    }
}
