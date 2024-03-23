package org.project.collection.set;

import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetExample {
    public static void main(String[] args) {

        ConcurrentSkipListSet<Integer> numbers = new ConcurrentSkipListSet<>();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                numbers.add(i);
                System.out.println(STR."Added \{i} to the set");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 9; i >= 0; i--) {
                numbers.add(i);
                System.out.println(STR."Added \{i} to the set");
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
            System.err.println(STR."Thread was interrupted: \{e.getMessage()}");
        }

        System.out.println("Contents of the ConcurrentSkipListSet: ");
        numbers.forEach(number -> System.out.print(STR."\{number} "));
    }

}