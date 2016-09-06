package pl.upaid.entity;

import lombok.Data;
import pl.upaid.domain.Gender;

import javax.persistence.*;

@Entity
@Data
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String pass;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
    private String details;
}