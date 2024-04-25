package org.project.map;

import lombok.Getter;
import org.project.model.Castle;
import org.project.model.Visitor;

import java.util.HashMap;
import java.util.Map;

@Getter
public class BookingService {

    private final Map<Castle, Visitor> bookings = new HashMap<>();

    /**
     * The provided Visitor is placed in the bookings Map and associated with the provided castle,
     * only if no other visitor is associated with the castle.
     * Returns a boolean that indicates if the Visitor was successfully placed in the castle.

     * The putIfAbsent Method:
     * The key operation here is putIfAbsent, a method provided by the Map interface in Java.
     * The method works as follows:
     *   - It checks if the provided key (castle in this case) already has an associated
     *     value (a visitor) in the map (bookings).
     *   - If the castle is not already associated with a visitor, the method associates
     *     the given visitor with the castle and returns null (indicating there was no
     *     previous association for this castle).
     *   - If the castle already has a visitor associated with it, the method does nothing
     *     to the map (leaving the existing association unchanged) and returns the visitor
     *     currently associated with the castle.

     * Return Value: The method returns a boolean value indicating whether the booking was
     * successful:
     *   - If putIfAbsent returns null, it means the castle was not previously booked, so the
     *     method successfully places the visitor in the castle and returns true.
     *   - If putIfAbsent returns a non-null value (the visitor already associated with the
     *     castle), it means the booking could not be completed because the castle was already
     *     booked, so the method returns false.
     */
    public boolean book (Castle castle, Visitor visitor) {
        return this.bookings.putIfAbsent(castle,visitor) == null;
    }

    /**
     * Calculates the total revenue generated from all booked castles. This method
     * returns a double that totals the entrance fee of each Castle booked in the
     * bookings Map.
     */
    public double totalRevenue(){
        return this.bookings.keySet().stream().mapToDouble(Castle::getEntranceFee).sum();
    }
}