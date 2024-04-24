package org.project.collection.list.copyOnWriteArrayList;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

    private static final CopyOnWriteArrayList<String> subscriberList = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            subscriberList.add("Subscriber 1");
            subscriberList.add("Subscriber 2");
            subscriberList.add("Subscriber 3");
            System.out.println("Thread 1 (Add): Subscribers added.");
            System.out.println(STR."Thread 1 (State): \{subscriberList}");
        });


        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(STR."Thread interrupted: \{e.getMessage()}");
                return;
            }
            subscriberList.remove("Subscriber 2");
            System.out.println("Thread 2 (Remove): Subscriber removed.");
            subscriberList.add("Subscriber 5");
            System.out.println(STR."Thread 2 (State): \{subscriberList}");
        });

        Thread thread3 = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(STR."Thread interrupted: \{e.getMessage()}");
                return;
            }
            System.out.println("Thread 3 (Iterate): Starting to notify subscribers.");
            subscriberList.forEach(subscriber ->
                    System.out.println(STR."Thread 3 (Iterate): Notifying \{subscriber}"));
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }

}