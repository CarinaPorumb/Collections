package org.project.collection.list.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample2 {
    public static void main(String[] args) {

        Vector<String> colours = new Vector<>();
        colours.ensureCapacity(10); // Ensures capacity, but default initial capacity is 10
        System.out.println(STR."Initial capacity: \{colours.capacity()}");
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
        colours.add("Fuchsia"); // This addition triggers an increase in capacity
        System.out.println(STR."Capacity of vector after adding elements: \{colours.capacity()}");

        // Trims the vector capacity to the current size of the vector
        colours.trimToSize();
        System.out.println(STR."Capacity of vector after trimming: \{colours.capacity()}");


        // Adding elements using addElement()
        //add() is part of the Java Collections Framework. It is defined in the List interface and implemented by Vector
        //addElement() is a legacy method from the original Vector class. Both used in Vector are synchronized for thread safety.
        colours.addElement("Yellow");
        colours.removeElement("Black");
        System.out.println(STR."Vector after additions and removal: \{colours}");

        Enumeration<String> colourEnum = colours.elements();
        System.out.print("Enumerating Vector: ");
        while (colourEnum.hasMoreElements()) {
            System.out.print(STR."\{colourEnum.nextElement()} ");
        }
        System.out.println();

        System.out.println(STR."First element: \{colours.firstElement()} \nLast element: \{colours.lastElement()}");

        System.out.println(STR."Element at index 1: \{colours.elementAt(1)}");
        colours.setElementAt("Yellow", 1);
        System.out.println(STR."Vector after updating index 1 to Yellow: \{colours}");

    }
}