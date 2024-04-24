package org.project.collection.queueAndDeque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListDequeExample {
    private final static Scanner scanner = new Scanner(System.in);
    private static final Deque<String> tasks = new LinkedList<>(List.of(
            "Go for a morning run around the park",
            "Complete a chapter of current art study",
            "Meditate for 15 minutes"));

    public static void main(String[] args) {

        try {
            while (true) {
                System.out.println(STR."Current tasks: \n \{tasks}");
                System.out.println("Choose an action: \n [1] Add task \n [2] Remove task \n [3] Exit");
                String input = scanner.nextLine().trim();

                switch (input) {
                    case "1":
                        addTask();
                        break;
                    case "2":
                        removeTask();
                        break;
                    case "3":
                        System.out.println(STR."Exiting task manager. Remaining tasks: \{tasks}");
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                        break;
                }
            }
        } finally {
            scanner.close();
        }
    }

    public static void addTask() {
        System.out.println("Enter a new task:");
        String task = scanner.nextLine();
        System.out.println("Add task to [1] Beginning [2] End?");
        String position = scanner.nextLine();

        if ("1".equals(position)) {
            tasks.addFirst(task);
            System.out.println(STR."Added '\{task}' to the beginning of the task list.");
        } else if ("2".equals(position)) {
            tasks.addLast(task);
            System.out.println(STR."Added '\{task}' to the end of the task list.");
        } else {
            System.out.println("Invalid choice. Task not added.");
        }
        System.out.println(STR."Updated tasks: \{tasks}");
    }

    public static void removeTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to remove.");
            return;
        }

        System.out.println("Remove task from [1] Beginning [2] End?");
        String position = scanner.nextLine();

        if ("1".equals(position)) {
            String removedTask = tasks.removeFirst();
            System.out.println(STR."Removed '\{removedTask}' from the beginning.");
        } else if ("2".equals(position)) {
            String removedTask = tasks.removeLast();
            System.out.println(STR."Removed '\{removedTask}' from the end.");
        } else {
            System.out.println("Invalid choice. No task removed.");
        }

        if (!tasks.isEmpty()) {
            System.out.println(STR."Next task to be removed from the beginning: \{tasks.peekFirst()}");
            System.out.println(STR."Next task to be removed from the end: \{tasks.peekLast()}");
        } else {
            System.out.println("The tasks list is now empty.");
        }
    }
}