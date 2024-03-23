package org.project.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CastleService {

    private Collection<Castle> castles;

    public CastleService() {
        this.castles = new ArrayList<>();
    }

    public Collection<Castle> getAllCastles() {
        return new ArrayList<>(this.castles);
    }

    public void addCastle(String name, String type, String country, int dailyToursAvailable, int entranceFee) {
        this.castles.add(new Castle(name, type, country, dailyToursAvailable, entranceFee));
    }

    public void addCastlesFromArray(Castle[] castles) {
        this.castles.addAll(Arrays.asList(castles));
    }

    public void removeCastle(Castle castle) {
        this.castles.remove(castle);
    }

    public boolean hasCastle(Castle castle) {
        return this.castles.contains(castle);
    }

    // Returns all Castles as an Array of Castles in the **order** they were added.
    public Castle[] asArray() {
        return this.castles.toArray(new Castle[0]);
    }


    // The original Castle Inventory collection MUST NOT BE MODIFIED
    public Collection<Castle> findCastlesByType(String type) {
        Collection<Castle> copy = new ArrayList<>(castles);
        copy.removeIf(elem -> !elem.getType().equals(type));
        return copy;
    }

    public Collection<Castle> findCastlesByTypeIterative(String type) {
        Collection<Castle> sortedCastle = new ArrayList<>();

        for (Castle castle : castles) {
            if (castle.getType().equals(type)) {
                sortedCastle.add(castle);
            }
        }
        return sortedCastle;
    }


    public void applyDiscount(int discount) {
        this.castles.forEach(castle -> castle.setEntranceFee(castle.getEntranceFee() - discount));
    }

    public Collection<Castle> filterCastlesByMinimumDailyTour(int requiredDailyTour) {
        return castles.stream()
                .filter(castle -> castle.getDailyToursAvailable() >= requiredDailyTour)
                .toList();
    }

    public Collection<Castle> filterCastlesByMinimumDailyTourIterative(int requiredDailyTour) {
        Collection<Castle> matches = new ArrayList<>();

        for (Castle castle : castles) {
            if (castle.getDailyToursAvailable() >= requiredDailyTour) {
                matches.add(castle);
            }
        }
        return matches;
    }

    public Collection<Castle> findCastlesByFeeAndType(int entranceFee, String type) {
        Collection<Castle> matches = castles.stream()
                .filter(castle -> castle.getEntranceFee() <= entranceFee)
                .filter(castle -> castle.getType().equals(type))
                .toList();
        return matches;
    }

    public Collection<Castle> findCastlesByFeeAndTypeIterative(int entranceFee, String type) {
        Collection<Castle> matches = new ArrayList<>();
        for (Castle castle : castles) {
            if (castle.getType().equals(type) && castle.getEntranceFee() <= entranceFee) {
                matches.add(castle);
            }
        }
        return matches;
    }

}