package org.project.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.project.model.Castle;
import org.project.model.Visitor;

import static org.junit.jupiter.api.Assertions.*;

class BookingServiceTest {

    BookingService bookingService;

    Castle windsor, edinburgh, chenonceau, pena, chambord, peles;
    Visitor john, maria, emma, roger, bob, ana;

    @BeforeEach
    void setUp() {
        bookingService = new BookingService();

        windsor = new Castle("Windsor", "Palace", "England", 3, 30);
        edinburgh = new Castle("Edinburgh", "Historical Fortress", "Scotland", 4, 20);
        chenonceau = new Castle("Chenonceau", "Renaissance", "France", 5, 20);
        pena = new Castle("Pena", "Romanticist", "Portugal", 5, 25);
        chambord = new Castle("Chambord", "Renaissance", "France", 5, 15);
        peles = new Castle("Peles", "Neo Renaissance", "Romania", 5, 20);

        john = new Visitor("John", "Doe", false);
        maria = new Visitor("Maria", "Doe", true);
        emma = new Visitor("Emma", "Doe", true);
        roger = new Visitor("Roger", "Doe", true);
        bob = new Visitor("Bob", "Doe", false);
        ana = new Visitor("Ana", "Doe", false);
    }

    @Test
    @DisplayName("Test Castle Booking Validity: Ensure Castles Can Be Booked Only Once")
    void book() {
        assertTrue(bookingService.book(windsor, bob));
        assertTrue(bookingService.book(edinburgh, maria));
        assertTrue(bookingService.book(chenonceau, emma));

        assertFalse(bookingService.book(windsor, roger));
        assertFalse(bookingService.book(edinburgh, bob));
        assertFalse(bookingService.book(chenonceau, ana));
    }

    @Test
    @DisplayName("Verify Total Revenue Calculation")
    void totalRevenue() {
        bookingService.book(windsor, john);
        bookingService.book(edinburgh, emma);
        bookingService.book(chenonceau, roger);
        bookingService.book(chambord, bob);

        assertEquals(85, bookingService.totalRevenue());

        bookingService.book(peles, ana);
        assertEquals(105, bookingService.totalRevenue());
    }
}