package org.project.collection.set;

import org.project.model.Castle;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueSetCharacteristics {
    public static void main(String[] args) {

        Castle windsor = new Castle("Windsor", "Palace", "England", 3, 30);
        Castle edinburgh = new Castle("Edinburgh", "Historical Fortress", "Scotland", 4, 20);
        Castle chenonceau = new Castle("Chenonceau", "Renaissance", "France", 5, 20);
        Castle peles = new Castle("Peles", "Neo-Renaissance", "Romania", 5, 20);
        Castle pena = new Castle("Pena", "Romanticist", "Portugal", 5, 25);
        Castle edinburghDuplicate = new Castle("Edinburgh", "Historical Fortress", "Scotland", 4, 20);

        Set<Castle> castles = new HashSet<>();
        castles.add(windsor);
        castles.add(edinburgh);
        castles.add(edinburgh);
        castles.add(edinburghDuplicate);
        castles.add(pena);

        castles.stream()
                .map(Castle::getName)
                .forEach(System.out::println);

        System.out.println();

        Set<Castle> castlesLinked = new LinkedHashSet<>();
        castlesLinked.add(pena);
        castlesLinked.add(edinburgh);
        castlesLinked.add(peles);
        castlesLinked.add(edinburgh);
        castlesLinked.add(chenonceau);
        castlesLinked.add(edinburghDuplicate);
        castlesLinked.add(windsor);

        castlesLinked.stream().map(Castle::getName)
                .forEach(System.out::println);


        Set<Castle> otherCastles = Set.of(peles, pena);
        // otherCastles.add(edinburgh); // UnsupportedOperationException


        Set<Castle> otherCastles1 = new HashSet<>(Set.of(peles, pena));
        otherCastles1.add(edinburgh);
        System.out.println(otherCastles1);


        Set<Castle> moreCastles = Set.copyOf(castles);
        //  moreCastles.add(peles); // UnsupportedOperationException

        Set<Castle> moreCastles1 = new HashSet<>(Set.copyOf(castles));
        moreCastles1.add(peles);
        System.out.println(moreCastles1);

    }
}