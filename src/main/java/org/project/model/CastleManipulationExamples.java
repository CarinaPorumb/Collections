package org.project.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CastleManipulationExamples {
    public static void main(String[] args) {

        Castle windsor = new Castle("Windsor", "Palace", "England", 3, 30);
        Castle edinburgh = new Castle("Edinburgh", "Historical Fortress", "Scotland", 4, 20);
        Castle chenonceau = new Castle("Chenonceau", "Renaissance", "France", 5, 20);
        Castle peles = new Castle("Peles", "Neo-Renaissance", "Romania", 5, 20);
        Castle pena = new Castle("Pena", "Romanticist", "Portugal", 5, 25);

        Collection<Castle> castles = new ArrayList<>(Arrays.asList(chenonceau, edinburgh, peles, windsor, pena));
        chenonceau.setOpenToPublic(true);
        edinburgh.setOpenToPublic(true);
        peles.setOpenToPublic(true);

        totalEntranceFeesOfOpenCastles(castles);
    }


    private static void totalEntranceFeesOfOpenCastles(Collection<Castle> castles) {
        Collection<Castle> openCastles = castles.stream()
                .filter(Castle::isOpenToPublic)
                .toList();

        double total = openCastles.stream()
                .mapToDouble(Castle::getEntranceFee)
                .sum();

        System.out.println(total);
    }

    private static void createAndDisplayOpenCastlesList(Collection<Castle> castles) {
        Collection<Castle> openCastles = castles.stream()
                .filter(Castle::isOpenToPublic)
                .toList();

        openCastles.stream()
                .map(Castle::getName)
                .forEach(System.out::println);
    }

    private static void displayOpenCastlesUsingStreams(Collection<Castle> castles) {
        castles.stream()
                .filter(Castle::isOpenToPublic)
                .forEach(castle -> System.out.println(castle.getName()));
    }

    private static void removeClosedCastlesUsingForeach(Collection<Castle> castles) {
        // To avoid a ConcurrentModificationException, which occurs when attempting to modify a collection during iteration,
        // we create a separate collection for castles to be removed. This approach prevents the Exception by ensuring that
        // we do not directly modify the collection while iterating over it. Instead, we collect the items to be removed
        // in a separate collection and then remove all those items in a single operation.

        Collection<Castle> closedCastles = new ArrayList<>();

        for (Castle castle : castles) {
            if (!castle.isOpenToPublic()) {
                closedCastles.add(castle);
            }
        }
        castles.removeAll(closedCastles);

        castles.forEach(castle -> System.out.println(castle.getName()));
    }

    private static void removeClosedCastlesUsingIterator(Collection<Castle> castles) {
        Iterator<Castle> iterator = castles.iterator();
        while (iterator.hasNext()) {
            Castle castle = iterator.next();

            if (!castle.isOpenToPublic()) {
                iterator.remove();
            }
        }
        castles.forEach(castle -> System.out.println(castle.getName()));

    }

    private static void demonstrateIteratorUsage(Collection<Castle> castles) {
        Iterator<Castle> iterator = castles.iterator();
        Iterator<Castle> iterator2 = castles.iterator();
        System.out.println(iterator.next().getName());
        System.out.println(iterator.next().getName());
        System.out.println(iterator.next().getName());
        System.out.println(iterator2.next().getName());
    }

    private static void iterateCastlesWithIterator(Collection<Castle> castles) {
        Iterator<Castle> iterator = castles.iterator();
        while (iterator.hasNext()) {
            Castle castle = iterator.next();
            System.out.print(STR."\{castle.getName()} ");
        }
    }

    private static void iterateCastlesWithForeach(Collection<Castle> castles) {
        for (Castle castle : castles) {
            System.out.print(STR."\{castle.getName()} ");
        }
    }

    private static void iterateCastlesWithStreams(Collection<Castle> castles) {
        castles.forEach(castle -> System.out.print(STR."\{castle.getName()} "));
    }

}