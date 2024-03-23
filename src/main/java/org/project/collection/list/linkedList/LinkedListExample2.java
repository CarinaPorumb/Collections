package org.project.collection.list.linkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {

        LinkedList<String> colours = new LinkedList<>();
        colours.add("Turquoise");
        colours.add("Magenta");
        colours.add("Black");
        colours.add("White");
        colours.add("Grey");
        System.out.println(colours);

        // Using Iterator
        Iterator<String> iterator = colours.iterator();
        System.out.print("List using Iterator: ");
        while (iterator.hasNext()) {
            System.out.print(STR."\{iterator.next()} ");
        }
        System.out.println();

        // Descending iterator
        Iterator<String> descendingIterator = colours.descendingIterator();
        System.out.print("List using Descending Iterator: ");
        while (descendingIterator.hasNext()) {
            System.out.print(STR."\{descendingIterator.next()} " );
        }
        System.out.println();


        // Create a shallow copy of the LinkedList.
        LinkedList<String> clonedColours = (LinkedList<String>) colours.clone();
        System.out.println(STR."Cloned List: \{clonedColours}");
        System.out.println();

        // Using LinkedList as a Queue
        colours.offer("Purple"); // Adds to the end of the list
        System.out.println(STR."Peek: \{colours.peek()}"); // Retrieves but does not remove the head
        System.out.println(STR."Poll: \{colours.poll()}"); // Retrieves and removes the head
        System.out.println(colours);
        System.out.println();

        // Using LinkedList as a Deque
        colours.offerFirst("Orange"); // Adds to the start of the list
        colours.offerLast("Yellow"); // Adds to the end of the list
        System.out.println(STR."First: \{colours.peekFirst()}");
        System.out.println(STR."Last: \{colours.peekLast()}");

        //Conversion to Array:
        String[] colourArray = colours.toArray(new String[0]);
        System.out.println(Arrays.toString(colourArray));
    }
}