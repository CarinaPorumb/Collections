package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Castle {

    private String name;
    private String type;
    private String country;
    private int dailyToursAvailable;
    private int entranceFee;
    private boolean isOpenToPublic;

    public Castle(String name, String type, String country, int dailyToursAvailable, int entranceFee) {
        this.name = name;
        this.type = type;
        this.country = country;
        this.dailyToursAvailable = dailyToursAvailable;
        this.entranceFee = entranceFee;
    }

    @Override
    public boolean equals(Object o) {

        System.out.printf("Comparing %s with %s%n", this.name, ((Castle) o).name);

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Castle castle = (Castle) o;
        return Objects.equals(name, castle.name) && Objects.equals(type, castle.type) && Objects.equals(country, castle.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, country);
    }
}