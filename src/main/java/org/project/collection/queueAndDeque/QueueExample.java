package org.project.collection.queueAndDeque;

import org.project.model.Visitor;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Visitor john = new Visitor("John", "Doe", false);
        Visitor bob = new Visitor("Bob", "Doe", false);
        Visitor maria = new Visitor("Maria", "Doe", true);
        Visitor sonia = new Visitor("Sonia", "Doe", true);

        Queue<Visitor> visitorQueue = new ArrayDeque<>();

        visitorQueue.offer(john); // add() could throw IllegalStateException if the queue is capacity-restricted.
        visitorQueue.offer(maria);
        visitorQueue.offer(bob);
        visitorQueue.offer(sonia);
        print(visitorQueue);

        Visitor visitorPoll = visitorQueue.poll(); // remove() would throw NoSuchElementException if the queue is empty.
        System.out.println(STR."Method poll \{visitorPoll}");
        print(visitorQueue);

        Visitor visitorPeek = visitorQueue.peek(); // element() would throw NoSuchElementException if the queue is empty.
        System.out.println(STR."Method Peek: \{visitorPeek}");
        print(visitorQueue);

    }

    public static void print(Queue<Visitor> queue) {
        System.out.format("%n -- Queue Contents -- %n");
        int x = 0;

        for (Visitor visitor : queue) {
            System.out.format("%x: %s %s %n", x++, visitor.toString(), x == 1 ? "(Head)" : "");
        }

        System.out.println();
    }

}