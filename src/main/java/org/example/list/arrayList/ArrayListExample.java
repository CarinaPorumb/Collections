package org.example.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> colours = new ArrayList<>();
        colours.add("Purple");
        colours.add("White");
        colours.add("Yellow");
        colours.add("Black");
        System.out.println(colours);

        colours.add("Orange");
        System.out.println(colours);

        //Inserting "Fuchsia" at the 4th position (index 3)
        colours.add(3, "Fuchsia");
        colours.addFirst("Gray");
        System.out.println(colours);

        // Replacing the element at index 4 with "White"
        colours.set(4, "White");
        System.out.println(colours);
        System.out.println();

        ArrayList<String> colours2 = new ArrayList<>();
        colours2.add("Red");
        colours2.add("Blue");
        colours2.add("Yellow");
        colours2.add("Green");
        colours2.add("Black");
        colours2.remove(2);
        colours2.remove("Black");
        System.out.println(colours2);
        System.out.println();


        // Retain only the common elements between the two lists
        colours.retainAll(colours2);
        System.out.println(STR."List after retaining common elements: \{colours}");


        // Creating a List of Lists:
        // Combines multiple lists (colours and colours2 in this case) into a single list where each element is itself a list.
        // Useful when you want to group related lists together, like managing different categories of items in a nested list structure.
        List<List<String>> coloursListOfLists = List.of(colours, colours2);
        System.out.println(STR."List of lists: \{coloursListOfLists}");
        System.out.println();


        // Combining Two Lists into a Single List:
        // Merges two lists (colours and colours2) into a new list allColours, preserving the order of elements as they appear in the original lists.
        // Ideal for scenarios where you need to aggregate data from multiple sources into a single collection for processing or display.
        List<String> allColours = new ArrayList<>();
        allColours.addAll(colours);
        allColours.addAll(colours2);
        System.out.println(STR."Combined List of 'colours' and 'colours2': \{allColours}");
        System.out.println();


        // Creating a Copy of a List Using Constructor:
        // Creates a new list (copiedColours) that is a shallow copy of an existing list (colours). Both lists are independent, but the elements (if mutable) are shared.
        // Useful when you need a separate list to modify without affecting the original list, assuming elements are immutable, or you don't intend to modify them.
        List<String> copiedColours = new ArrayList<>(colours);
        System.out.println(STR."Shallow Copied List: \{copiedColours}");
        System.out.println();


        // Creating an immutable copy of the 'colours' list using List.copyOf for read-only purposes
        // Generates an immutable copy (immutableCopied) of a list (colours). This copy cannot be modified after creation.
        // Best used when you need a read-only version of a list to ensure its elements cannot be altered, enhancing security and predictability.
        List<String> immutableCopied = List.copyOf(colours);
        System.out.println(STR."Immutable Copied List: \{immutableCopied}");
        System.out.println();


        // Creating a new list 'newColoursList' by initializing an ArrayList with elements using List.of
        // Utilizes List.of to create an immutable list of predefined elements, which is then used to initialize a new ArrayList (newColoursList).
        // Use case: Ideal for initializing a list with a fixed set of elements where the initial content is known and shouldn't be changed later in that context.
        List<String> newColoursList = new ArrayList<>(List.of("Yellow", "Orange", "Red", "Brown"));
        System.out.println(STR."New List created using List.of: \{newColoursList}");
        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");


        //Trim Elements: Create new list with trimmed elements
        List<String> listToTrim = new ArrayList<>();
        listToTrim.add("  Purple ");
        listToTrim.add("  White ");
        listToTrim.add(" Yellow    ");
        listToTrim.add("    Black ");
        System.out.println(STR."Original List1: \{listToTrim}");


        //Trimming elements and adding them to a new list in one go
        List<String> trimList = new ArrayList<>();
        for (String elem : listToTrim) {
            trimList.add(elem.trim());
        }
        System.out.println(STR."Trimmed List: \{trimList}");
        System.out.println();


        //Trimming elements, adding them to a new list, and printing after each addition
        List<String> trimList2 = new ArrayList<>();
        for (String elem : listToTrim) {
            trimList2.add(elem.trim());
            System.out.println(STR."Current State of Trimmed List2: \{trimList2} ");
        }
        System.out.println();
    }
}