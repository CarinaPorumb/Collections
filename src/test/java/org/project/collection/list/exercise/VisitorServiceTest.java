package org.project.collection.list.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.project.model.Castle;
import org.project.model.Visitor;
import org.project.model.VisitorService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VisitorServiceTest {

    VisitorService visitorService;

    Castle windsor = new Castle("Windsor", "Palace", "England", 3, 30);
    Castle edinburgh = new Castle("Edinburgh", "Historical Fortress", "Scotland", 4, 20);
    Castle chenonceau = new Castle("Chenonceau", "Renaissance", "France", 5, 20);
    Castle peles = new Castle("Peles", "Neo Renaissance", "Romania", 5, 20);
    Castle pena = new Castle("Pena", "Romanticist", "Portugal", 5, 25);
    Castle chambord = new Castle("Chambord", "Renaissance", "France", 5, 15);
    Castle versailles = new Castle("Versailles", "Palace", "France", 4, 40);


    Visitor john, maria, emma, roger, bob;


    @BeforeEach
    void setUp() {
        this.visitorService = new VisitorService();

        john = new Visitor("John", "Doe", false);
        john.getPreferredCastles().addAll(List.of(edinburgh, chenonceau, pena));

        maria = new Visitor("Maria", "Doe", true);
        maria.getPreferredCastles().addAll(List.of(versailles, chambord));

        emma = new Visitor("Emma", "Doe", true);
        emma.getPreferredCastles().add(versailles);

        roger = new Visitor("Roger", "Doe", true);
        bob = new Visitor("Bob", "Doe", false);
    }

    @Test
    void filterByFavoriteCastle() {
        assertTrue(VisitorService.filterByFavoriteCastle(List.of(john, maria, emma, roger, bob), versailles).containsAll(List.of(maria, emma)));
        assertFalse(VisitorService.filterByFavoriteCastle(List.of(john, maria, emma, roger, bob), versailles).containsAll(List.of(emma, bob, roger)));
        assertTrue(VisitorService.filterByFavoriteCastle(List.of(john, maria, emma, roger, bob), edinburgh).contains(john));
        assertFalse(VisitorService.filterByFavoriteCastle(List.of(john, maria, emma, roger, bob), edinburgh).containsAll(List.of(john, maria, emma, roger, bob)));
        assertTrue(VisitorService.filterByFavoriteCastle(List.of(john, maria, emma, roger, bob), peles).isEmpty());
    }


    @Test
    void checkIn(){
        visitorService.checkIn(john);
        visitorService.checkIn(maria);
        visitorService.checkIn(emma);
        visitorService.checkIn(roger);
        visitorService.checkIn(bob);

        List<Visitor> visitors = visitorService.getVisitorsList();

        assertEquals(0, visitors.indexOf(maria));
        assertEquals(1, visitors.indexOf(emma));
        assertEquals(2, visitors.indexOf(roger));
        assertEquals(3, visitors.indexOf(john));
        assertEquals(4, visitors.indexOf(bob));
    }


    @Test
    void swapPosition(){
        visitorService.checkIn(john);
        visitorService.checkIn(maria);
        visitorService.checkIn(emma);
        visitorService.checkIn(roger);
        visitorService.checkIn(bob);

        visitorService.swapPosition(maria,john);
        visitorService.swapPosition(emma,roger);

        List<Visitor> visitors = visitorService.getVisitorsList();

        assertEquals(0, visitors.indexOf(john));
        assertEquals(1, visitors.indexOf(roger));
        assertEquals(2, visitors.indexOf(emma));
        assertEquals(3, visitors.indexOf(maria));
        assertEquals(4, visitors.indexOf(bob));
    }

}