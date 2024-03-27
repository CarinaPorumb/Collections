package org.project.collection.queueAndDeque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListDequeExample {
    private final static Scanner scanner = new Scanner(System.in);
    private static final Deque<String> game = new LinkedList<>(List.of("owl", "penguin"));

    public static void main(String[] args) {
        while (true) {
            System.out.println(STR."Current game state: \{game}");
            System.out.println("Choose an action: \n [1] Add word \n [2] Remove word \n [3] Exit");
            String input = scanner.nextLine().trim();

            switch (input) {
                case "1" -> addWord();
                case "2" -> removeWord();
                case "3" -> {
                    System.out.println(STR."Exiting game. Final game state: \{game}");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }

        }
    }

    public static void addWord() {
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        System.out.println("Add to [1] Beginning [2] End?");
        String position = scanner.nextLine();

        if ("1".equals(position)) {
            game.addFirst(word);
            System.out.println(STR."Added '\{word}' to the beginning.");
        } else if ("2".equals(position)) {
            game.addLast(word);
            System.out.println(STR."Added '\{word}' to the end.");
        } else {
            System.out.println("Invalid choice. Word not added.");
        }

        System.out.println(STR."Updated game state: \{game}");
    }

    public static void removeWord() {
        if (game.isEmpty()) {
            System.out.println("The game is empty. No words to remove.");
        }

        System.out.println("Remove from [1] Beginning [2] End?");
        String position = scanner.nextLine();

        if ("1".equals(position)) {
            String removedWord = game.removeFirst();
            System.out.println(STR."Removed '\{removedWord}' from the beginning.");
        } else if ("2".equals(position)) {
            String removedWord = game.removeLast();
            System.out.println(STR."Removed '\{removedWord}' from the end.");
        } else {
            System.out.println("Invalid choice. No word removed.");
        }

        if (!game.isEmpty()) {
            System.out.println(STR."Next word to be removed from the beginning: \{game.peekFirst()}");
            System.out.println(STR."Next word to be removed from the end: \{game.peekLast()}");
        } else {
            System.out.println("The game is now empty.");
        }
    }
}