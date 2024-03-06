package org.example.queueAndDeque;

import org.example.model.Visitor;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        Visitor john = new Visitor("John", "Doe", false);
        Visitor maria = new Visitor("Maria", "Doe", true);
        Visitor sonia = new Visitor("Sonia", "Doe", true);
        Visitor bob = new Visitor("Bob", "Doe", false);

        Comparator<Visitor> accessComparator = Comparator.comparing(Visitor::isHaveExclusiveAccess);
        Comparator<Visitor> accessComparatorReversed = Comparator.comparing(Visitor::isHaveExclusiveAccess).reversed();

        Queue<Visitor> visitorQueue = new PriorityQueue<>(accessComparator);
        visitorQueue.offer(john);
        visitorQueue.offer(maria);
        visitorQueue.offer(sonia);
        visitorQueue.offer(bob);

        Queue<Visitor> visitorQueueReversed = new PriorityQueue<>(accessComparatorReversed);
        visitorQueueReversed.offer(john);
        visitorQueueReversed.offer(maria);
        visitorQueueReversed.offer(sonia);
        visitorQueueReversed.offer(bob);

        System.out.println("Natural Order Queue:");
        printQueueInPriorityOrder(visitorQueue);
        System.out.println();
        System.out.println("Reversed Order Queue:");
        printQueueInPriorityOrder(visitorQueueReversed);
    }

    /**
     * Use poll() within a while loop to accurately display the priority order of elements in a PriorityQueue.
     * Directly printing the PriorityQueue via toString() (e.g., System.out.println(queue)) does not reflect the
     * true priority order, because the iterator provided by PriorityQueue does not guarantee traversal in priority order.
     * Polling ensures elements are retrieved and displayed according to their actual priority, as defined by the
     * queue's comparator.
     */

    public static void printQueueInPriorityOrder(Queue<Visitor> queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

}