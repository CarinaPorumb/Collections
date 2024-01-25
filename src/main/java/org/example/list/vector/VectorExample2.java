package org.example.list.vector;

import java.util.Vector;

public class VectorExample2 {
    public static void main(String[] args) {


        Vector<String> colours = new Vector<>();
        colours.ensureCapacity(5); //default is 10
        System.out.println(STR."Capacity of vector: \{colours.capacity()}");
        colours.add("Purple");
        colours.add("White");
        colours.add("Black");
        colours.add("Turquoise");
        colours.add("Orange");
        colours.add("Yellow");
        colours.add("Blue");
        colours.add("Grey");
        colours.add("Pink");
        colours.add("Magenta");
        colours.add("Fuchsia");
        System.out.println(STR."Capacity of vector: \{colours.capacity()}");

        // Trims vector capacity to the current size of the vector
        colours.trimToSize();
        System.out.println(STR."Capacity of vector: \{colours.capacity()}");

    }
}