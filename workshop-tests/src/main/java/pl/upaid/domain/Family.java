package pl.upaid.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Family {

    private Person owner;
    private Animal animal;
}
