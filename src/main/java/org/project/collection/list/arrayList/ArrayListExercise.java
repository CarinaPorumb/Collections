package org.project.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExercise {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<String> colours = new ArrayList<>();

    public static void main(String[] args) {

        colours.add("purple");
        colours.add("white");
        colours.add("turquoise");
        colours.add("yellow");
        colours.add("orange");
        System.out.println(colours);

        //getColour();
        //addOrUpdateColour();
        //deleteColour();

        scanner.close();
    }

    public static void getColour() {
        System.out.print("Enter a position or a colour name: ");
        String input = scanner.next();

        try {
            int position = Integer.parseInt(input);
            if (position < 0 || position >= colours.size()) {
                System.out.println("Invalid position.");
            } else {
                System.out.println(STR."Colour at position \{position}: \{colours.get(position)}");
            }
        } catch (NumberFormatException e) {
            if (colours.contains(input.toLowerCase())) {
                System.out.println(STR."The colour \{input} exists in the list.");
            } else {
                System.out.println(STR."The colour \{input} doesn't exist in the list.");
            }
        }
    }

    private static void addOrUpdateColour() {
        int position = 0;
        try {
            System.out.print("Insert position: ");
            position = Integer.parseInt(scanner.nextLine());
            System.out.print("Insert colour: ");
            String colour = scanner.nextLine();

            if (position >= 0 && position <= colours.size()) {
                if (position == colours.size()) {
                    colours.add(colour);
                } else {
                    colours.set(position, colour);
                }
                System.out.println(STR."Updated colours list: \{colours}");
            } else {
                System.out.println(STR."Position \{position} is out of range. Please try again!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(STR."Index \{position} is out of bounds for the list.");
        }
    }

    private static void deleteColour() {
        System.out.print("Enter a position or a colour name to delete: ");
        String input = scanner.nextLine();

        try {
            int position = Integer.parseInt(input);
            if (position < 0 || position >= colours.size()) {
                System.out.println("Invalid position.");
            } else {
                colours.remove(position);
                System.out.println(STR."Colour at position \{position} removed. Updated list: \{colours}");
            }
        } catch (NumberFormatException e) {
            if (colours.contains(input.toLowerCase())) {
                colours.remove(input.toLowerCase());
                System.out.println(STR."The colour \{input} has been removed. Updated list: \{colours}");
            } else {
                System.out.println(STR."The colour \{input} doesn't exist in the list.");
            }
        }
    }

}