package org.project.collection.list.vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        Thread thread1 = new Thread(() -> {
            vector.add("Element 1");
            vector.add("Element 2");
        });

        Thread thread2 = new Thread(() -> {
            vector.add("Element 3");
            vector.add("Element 4");
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(STR."Thread was interrupted unexpectedly: \{e.getMessage()}");
        }

        System.out.println(STR."Vector contents: \{vector}");
    }

}