package pl.upaid.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.EnumType.STRING;

@Entity
@Data
public class Animal {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Enumerated(STRING)
    private Species species;
}
