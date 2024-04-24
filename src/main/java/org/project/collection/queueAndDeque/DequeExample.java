package org.project.collection.queueAndDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();
        Deque<String> queue = new ArrayDeque<>();

        // Using as a Stack (LIFO)
        System.out.println("-- Using as a Stack --");
        stack.push("Message 1"); // Push adds to the "top" of the stack
        print(stack);
        stack.push("Message 2");
        print(stack);
        stack.push("Message 3");
        print(stack);

        System.out.println(STR."Popped from stack: \{stack.pop()}"); // Pop removes from the "top"
        print(stack);

        System.out.println(STR."Peek: \{stack.peek()}"); // Peek views the "top" without removing
        print(stack);


        // Using as a Queue (FIFO)
        System.out.println("-- Using as a Queue --");
        queue.offer("Message 1"); // Offer adds to the "end" of the queue
        print(queue);
        queue.offer("Message 2");
        print(queue);
        queue.offer("Message 3");
        print(queue);

        System.out.println(STR."Removed from queue: \{queue.poll()}"); // Poll removes from the "front"
        print(queue);
        System.out.println(STR."Peek: \{queue.peek()}"); // Peek views the "front" without removing
        print(queue);

    }

    public static void print(Deque<String> deque) {
        System.out.format("%n -- Deque Contents -- %n");
        int x = 0;

        for (String msg : deque) {
            System.out.format("%x: %s %s %n", x++, msg, x == 1 ? "(Top)" : "");
        }
        System.out.println();
    }

}