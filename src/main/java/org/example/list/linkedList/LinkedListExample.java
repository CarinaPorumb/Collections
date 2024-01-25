package org.example.list.linkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> colours = new LinkedList<>();
        colours.add("Turquoise");
        colours.add("Magenta");
        colours.add("Teal");
        colours.add("Olive");
        colours.add("Black");
        colours.add("White");
        colours.add("Grey");
        System.out.println(colours);

        // addLast similar to 'add' in ArrayList
        colours.addLast("Orange");
        colours.addFirst("Fuchsia");
        System.out.println(colours);


        // 'offerFirst' and 'offerLast' add elements to the list's start and end, returning true on success.
        // They differ from 'addFirst' and 'addLast', as they don't throw exceptions on failure.
        // In LinkedList, they always return true due to no capacity limits.
        colours.offerFirst("Violet");
        colours.offerLast("Grey");
        System.out.println(STR."List after adding 'Violet' and 'Grey': \{colours}");
        System.out.println();


        // 'peekFirst' and 'peekLast' safely return the first and last elements or 'null' if the list is empty.
        System.out.println(STR."The first colour is \{colours.peekFirst()}, and the last colour is \{colours.peekLast()}");
        // 'getFirst' and 'getLast' return the first and last elements but throw an exception if the list is empty.
        System.out.println(STR."The first colour is \{colours.getFirst()}, and the last colour is \{colours.getLast()}");
        System.out.println();


        colours.removeFirst();
        colours.removeLast();
        System.out.println(colours);


        // 'pop' removes and returns the first element, similar to 'removeFirst', pop' is stack-specific, 'removeFirst' is list-specific.
        System.out.println(STR."Current list: \{colours}");
        System.out.println(STR."Element removed by pop: \{colours.pop()}");
        System.out.println(STR."List after pop: \{colours}");
        System.out.println();


        LinkedList<String> otherColours = new LinkedList<>();
        otherColours.add("Black");
        otherColours.add("White");
        otherColours.add("Grey");

        System.out.println(STR."List before removing elements: \{colours}");
        // 'removeAll' removes all elements that are also in 'otherColours'
        colours.removeAll(otherColours);
        System.out.println(STR."List after removing elements: \{colours}");

//        // Directly printing the result of 'removeAll' when called in System.out.println() shows a boolean value
//        System.out.println("Result of removing common elements again: " + colours.removeAll(otherColours));

        System.out.println(STR."Final list of colours: \{colours}");
    }

}