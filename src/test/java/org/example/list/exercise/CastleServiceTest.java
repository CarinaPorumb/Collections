package org.example.list.exercise;

import org.example.model.Castle;
import org.example.model.CastleService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class CastleServiceTest {

    CastleService castleService;

    @BeforeEach
    void setUp() {
        castleService = new CastleService();
        castleService.addCastle("Windsor", "Palace", "England", 3, 30);
        castleService.addCastle("Edinburgh", "Historical Fortress", "Scotland", 4, 20);
        castleService.addCastle("Chenonceau", "Renaissance", "France", 5, 20);
        castleService.addCastle("Peles", "Neo Renaissance", "Romania", 5, 20);
        castleService.addCastle("Pena", "Romanticist", "Portugal", 5, 25);
        castleService.addCastle("Chambord", "Renaissance", "France", 5, 15);
        castleService.addCastle("Versailles", "Palace", "France", 4, 40);
    }

    @Test
    @DisplayName("Ensure inventory is initialized and contains entries")
    void getAllCastles() {
        assertNotNull(castleService.getAllCastles(), "Inventory should not be null.");
        assertFalse(castleService.getAllCastles().isEmpty(), "Inventory should not be empty.");
    }

    @Test
    @DisplayName("Adding a castle increases inventory size by 1")
    void addCastle() {
        castleService.addCastle("Castel del Monte", "Medieval", "Italy", 2, 10);
        assertEquals(8, castleService.getAllCastles().size(), "Inventory size should increase by 1");
    }

    @Test
    @DisplayName("Successful bulk addition of castles from an array")
    void addCastlesFromArray() {
        Castle prague = new Castle("Prague", "Historic", "Czech Republic", 4, 15);
        Castle neuschwanstein = new Castle("Neuschwanstein", "Romanesque Revival", "Germany", 5, 25);

        Castle[] newCastles = {prague, neuschwanstein};
        castleService.addCastlesFromArray(newCastles);
        assertEquals(9, castleService.getAllCastles().size(), "Inventory should contain 8 castles after adding new ones");
    }

    @Test
    @DisplayName("Ensure a castle is successfully removed from inventory")
    void removeCastle() {
        Castle windsor = new Castle("Windsor", "Palace", "England", 3, 30);
        castleService.removeCastle(windsor);
        assertFalse(castleService.getAllCastles().contains(windsor), "Windsor should be removed from inventory.");
    }

    @Test
    @DisplayName("Verify castle presence with hasCastle method")
    void hasCastle() {
        Castle prague = new Castle("Prague", "Historic", "Czech Republic", 4, 15);
        assertFalse(castleService.hasCastle(prague), "Prague castle should not be reported as present.");
        assertTrue(castleService.hasCastle(new Castle("Peles", "Neo Renaissance", "Romania", 5, 20)), "Peles castle should be present.");
    }

    @Test
    @DisplayName("Verify all castles are returned as an array correctly")
    void asArray() {
        Castle[] castlesArray = castleService.asArray();
        assertAll("Ensure correct castle and order in array",
                () -> assertEquals(7, castlesArray.length, "Array should contain 7 castles."),
                () -> assertEquals("Pena", castlesArray[4].getName(), "Last castle should be Pena.")
        );
    }

    @Test
    @DisplayName("Filter castles by type")
    void findCastlesByType() {
        Collection<Castle> renaissanceCastles = castleService.findCastlesByType("Renaissance");
        assertAll("Verify Renaissance castles",
                () -> assertEquals(2, renaissanceCastles.size(), "Should contain 2 castles"),
                () -> assertTrue(renaissanceCastles.stream()
                        .allMatch(castle -> castle.getType().equals("Renaissance")), "All castles should be of the type 'Renaissance'")
        );
    }

    @Test
    @DisplayName("Iterative method to find rooms by type")
    void findCastlesByTypeIterative() {
        Collection<Castle> renaissanceCastles = castleService.findCastlesByTypeIterative("Renaissance");
        assertAll("Verify Renaissance castles",
                () -> assertEquals(2, renaissanceCastles.size(), "Should contain 2 castles"),
                () -> assertTrue(renaissanceCastles.stream()
                        .allMatch(castle -> castle.getType().equals("Renaissance")), "All castles should be of the type 'Renaissance'")
        );
    }

    @Test
    @DisplayName("Apply discount to all castles")
    void applyDiscount() {
        castleService.applyDiscount(15);
        assertAll("Verify discount applied correctly",
                () -> assertEquals(10, castleService.getAllCastles()
                                .stream()
                                .filter(castle -> castle.getName().equals("Pena"))
                                .findFirst()
                                .get()
                                .getEntranceFee(),
                        "The castle entrance fee for Pena should be discounted.")
        );
    }

    @Test
    @DisplayName("Filter castles by minimum daily tour")
    void filterCastlesByMinimumDailyTour() {
        Collection<Castle> filteredCastles = castleService.filterCastlesByMinimumDailyTour(5);
        assertTrue(filteredCastles
                        .stream()
                        .allMatch(castle -> castle.getDailyToursAvailable() >= 5),
                "All filtered castles should have a daily tours of 5 or more."
        );
    }

    @Test
    @DisplayName("Filter castles by minimum daily tour (Iterative)")
    void filterCastlesByMinimumDailyTourIterative() {
        Collection<Castle> filteredCastles = castleService.filterCastlesByMinimumDailyTourIterative(5);
        assertTrue(filteredCastles
                        .stream()
                        .allMatch(castle -> castle.getDailyToursAvailable() >= 5),
                "All filtered castles should have a daily tours of 5 or more."
        );
    }

    @Test
    @DisplayName("Find castles by fee and type")
    void findCastlesByFeeAndType() {
        Collection<Castle> foundCastles = castleService.findCastlesByFeeAndType(20, "Historical Fortress");
        assertTrue(foundCastles.contains(new Castle("Edinburgh", "Historical Fortress", "Scotland", 4, 20)),
                "Found castle should include Edinburgh"
        );
    }

    @Test
    @DisplayName("Find castles by fee and type (Iterative)")
    void findCastlesByFeeAndTypeIterative() {
        Collection<Castle> foundCastles = castleService.findCastlesByFeeAndType(20, "Historical Fortress");
        assertTrue(foundCastles.contains(new Castle("Edinburgh", "Historical Fortress", "Scotland", 4, 20)),
                "Found castle should include Edinburgh"
        );
    }

}