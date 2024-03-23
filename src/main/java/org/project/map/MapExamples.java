package org.project.map;

import org.project.model.Castle;
import org.project.model.Visitor;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExamples {
    public static void main(String[] args) {

        Castle edinburgh = new Castle("Edinburgh", "Historical Fortress", "Scotland", 4, 20);
        Castle chenonceau = new Castle("Chenonceau", "Renaissance", "France", 5, 20);

        Visitor john = new Visitor("John", "Doe", false);
        Visitor maria = new Visitor("Maria", "Doe", true);


        Map<Castle, Visitor> castleVisitors = new HashMap<>();
        castleVisitors.put(chenonceau, maria);

        System.out.println(castleVisitors.values());
        System.out.println(castleVisitors.keySet());
        System.out.println(castleVisitors.remove(chenonceau, maria));


        castleVisitors.put(chenonceau, maria);
        castleVisitors.put(edinburgh, john);

        System.out.println(STR."Edinburgh:  \{castleVisitors.get(edinburgh)}");
        System.out.println(STR."Chenonceau: \{castleVisitors.get(new Castle("Chenonceau", "Renaissance", "France", 5, 20))}");
        System.out.println();


        // Swapping visitors between castles
        // The `remove` method removes and returns the visitor, which is then immediately used in the `put` method to reassign
        // that visitor (Maria) to Edinburgh. The previous visitor of Edinburgh (if any) is returned and stored in `visitor`.
        // and assign to Chenonceau only if it currently has no assigned visitor.
        // The `putIfAbsent` method ensures that we do not overwrite an existing value.
        Visitor visitor = castleVisitors.put(edinburgh, castleVisitors.remove(chenonceau));
        castleVisitors.putIfAbsent(chenonceau, visitor);

        System.out.println(STR."Edinburgh:  \{castleVisitors.get(edinburgh)}");
        System.out.println(STR."Chenonceau: \{castleVisitors.get(new Castle("Chenonceau", "Renaissance", "France", 5, 20))}");

        System.out.println();


        Set<Map.Entry<Castle, Visitor>> setView = castleVisitors.entrySet();
        System.out.println(setView);


        // Preferred for map iteration.
        for (Map.Entry<Castle, Visitor> entry : castleVisitors.entrySet()) {
            Castle castle = entry.getKey();
            Visitor visitor1 = entry.getValue();
            System.out.format("%s : %s%n", castle.getName(), visitor1.getFirstName());
        }
    }


}
