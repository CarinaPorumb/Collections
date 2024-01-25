package org.example.list.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<String> colours = new Vector<>();
        colours.add("Purple");
        colours.add("White");
        colours.add("Black");
        colours.add("Turquoise");
        colours.addElement("Yellow"); // Similar to add()
        colours.removeElement("Black"); // Similar to remove()
        System.out.println(colours);

        //  add() is part of the Java Collections Framework. It's defined in the List interface and implemented by Vector

        // addElement() is a legacy method from the original Vector class, predating the Collections Framework
        // Its behavior is similar to add, but it's synchronized for thread safety.


        Enumeration<String> colour = colours.elements();
        while (colour.hasMoreElements()) {
            System.out.print(STR." \{colour.nextElement()}");
        }
        System.out.println();


        System.out.println(STR."First element: \{colours.firstElement()} \nLast element: \{colours.lastElement()}");


        // Retrieves an element at a specific index
        String colourAtIndex = colours.elementAt(1);
        System.out.println(STR."Element at index 1: \{colourAtIndex}");

        // Replacing an element at a specific index with a new element
        colours.setElementAt("Yellow", 1);
        System.out.println(STR."Updated vector: \{colours}");

    }
}