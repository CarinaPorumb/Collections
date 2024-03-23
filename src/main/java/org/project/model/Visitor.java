package org.project.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

@RequiredArgsConstructor
public class Visitor {

    private String firstName;
    private String lastName;
    private boolean haveExclusiveAccess;
    private final List<Castle> preferredCastles = new ArrayList<>();

    public Visitor(String firstName, String lastName, boolean haveExclusiveAccess) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.haveExclusiveAccess = haveExclusiveAccess;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Visitor that = (Visitor) o;

        if (!firstName.equals(that.firstName)) return false;
        return lastName.equals(that.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.firstName, this.lastName);
    }

}