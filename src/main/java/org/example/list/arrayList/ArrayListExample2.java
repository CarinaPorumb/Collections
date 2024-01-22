package org.example.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {

        List<String> colours = new ArrayList<>();
        colours.add("Purple");
        colours.add("White");
        colours.add("Yellow");
        colours.add("Black");

        List<String> colours2 = new ArrayList<>();
        colours2.add("Purple");
        colours2.add("White");
        colours2.add("Fuchsia");
        colours2.add("Orange");

        // Iterating over 'colours' list using a traditional for loop
        for (int i = 0; i < colours.size(); i++) {
            System.out.print(STR."\{colours.get(i)} ");
        }
        System.out.println();


        // Iterating over 'colours' list using a for-each loop
        for (String elem : colours) {
            System.out.print(STR."\{elem} ");
        }
        System.out.println();


        //Removing from 'colours2' all elements that are not found in 'colours'
        colours2.removeAll(colours);
        System.out.println(STR."List after 'removeAll' operation: \{colours2}");
        System.out.println();


        //Appending new elements at the end of the 'colours' list
        int number = 3;
        for (int i = 1; i <= number; i++) {
            colours.add(String.valueOf(i));
        }
        System.out.println(STR."Updated 'colours' list after appending numbers: \{colours}");



        System.out.println(STR."Last index of Yellow: \{colours.lastIndexOf("Yellow")}");
        System.out.println(STR."Element at the first index (index 0) of the list: \{colours.get(0)}");
        System.out.println(colours.getFirst());
        System.out.println();


        colours.set(4, "Green");
        System.out.println(STR."List after replacing the element at the 4th index with 'Green': \{colours}");


        colours.remove(6);
        colours.remove("Black");
        System.out.println(STR."List after removing element at index 6 and first 'Black': \{colours}");
        System.out.println();


        if (colours.contains("White"))
            System.out.println(STR."Element 'White' found at index: \{colours.indexOf("White")}");
        else
            System.out.println("Element 'White' not found in the list.");
        System.out.println();


        Collections.sort(colours);
        System.out.println(STR."Sorted list in natural order: \{colours}");
        System.out.println();


        Collections.shuffle(colours);
        System.out.println(STR."Shuffled list (random order): \{colours}");
        System.out.println();


        // Reversing the order of elements and printing the reversed list
        Collections.reverse(colours);
        System.out.println(STR."Reversed list: \{colours}");
        System.out.println();


        // Manually reversing 'colours' using a loop and printing each element
        System.out.print("Manually reversed list using loop: ");

        for (int i = colours.size() - 1; i >= 0; i--) {
            System.out.print(STR."\{colours.get(i)} ");
        }
        System.out.println();


        // Creating a sublist of the first 3 elements of 'colours' and printing it
        List<String> someColours = colours.subList(0, 3);
        System.out.println(STR."Sublist containing the first 3 elements: \{someColours}");


        colours2.clear();
        System.out.println(STR."List 'colours2' after clearing: \{colours2}");


        // Checking if 'colours2' is empty
        if (colours2.isEmpty())
            System.out.println("The list is empty.");
        else
            System.out.println("The list is not empty.");
    }

}