package org.example.list.arrayList;

import java.util.*;

public class ArrayListExample3 {
    public static void main(String[] args) {

        ArrayList<String> warmColours = new ArrayList<>();
        warmColours.add("Red");
        warmColours.add("Orange");
        warmColours.add("Yellow");

        ArrayList<String> coolColours = new ArrayList<>();
        coolColours.add("Blue");
        coolColours.add("Green");
        coolColours.add("Turquoise");


        // Compare the two color lists and print whether they are the same or not
        if (warmColours.equals(coolColours))
            System.out.println("The lists are identical in content and order.");
        else
            System.out.println("The lists differ in content or order.");
        System.out.println();

        ArrayList<String> warmColours2 = new ArrayList<>();
        warmColours2.add("Yellow");
        warmColours2.add("Orange");
        warmColours2.add("Red");

        if (warmColours.equals(warmColours2))
            System.out.println("The lists are identical in content and order.");
        else
            System.out.println("The lists differ in content or order.");
        System.out.println();


        System.out.println(STR."Original list: \{coolColours}");
        Collections.swap(coolColours, 1, 2);
        System.out.println(STR."List after swapping elements at indices 1 and 2: \{coolColours}");
        System.out.println();


        // Get the number of elements in the list
        System.out.println(STR."List contains: \{warmColours2.size()} colours: \{warmColours2}");


        // Check if the list contains a specific element
        if (warmColours2.contains("Red")) {
            System.out.println("List contains Red");
        }

        // Check if all elements in one list are also present in another list
        if (warmColours2.containsAll(coolColours)) {
            System.out.println("All elements from one list are also present in another list.");
        } else {
            System.out.println("Not all elements from one list are also present in another list.");
        }


        // Access an element at a specific position
        System.out.println(STR."Element at index 1: \{warmColours2.get(1)}");


        // Find the index of the first and the last occurrence of an element
        warmColours2.add("Orange");
        System.out.println(STR."Index of 'Orange': \{warmColours2.indexOf("Orange")}");
        System.out.println(STR."Last index of 'Orange': \{warmColours2.lastIndexOf("Orange")}");


        // Handling IndexOutOfBoundsException
        try {
            System.out.println(STR."Accessing invalid index: \{warmColours2.get(5)}");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(STR."ERROR: \{e.getMessage()}");
        }


        // Convert ArrayList to Array
        String[] coloursArray = warmColours2.toArray(new String[0]);
        System.out.println(STR."Array: \{Arrays.toString(coloursArray)}");


        // Using Iterator
        Iterator<String> iterator = warmColours2.iterator();
        System.out.print("List using Iterator: ");
        while (iterator.hasNext()) {
            System.out.print(STR."\{iterator.next()} ");
        }
        System.out.println();


        // Synchronize the ArrayList
        List<String> syncColours = Collections.synchronizedList(warmColours2);
        synchronized (syncColours) {
            syncColours.forEach(System.out::println);
        }

    }
}