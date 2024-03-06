package org.example.queueAndDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {

        Deque<String> messageStack = new ArrayDeque<>();
        messageStack.push("Message 1");
        print(messageStack);
        messageStack.push("Message 2");
        print(messageStack);
        messageStack.push("Message 3");
        print(messageStack);
        messageStack.push("Message 4");
        print(messageStack);

        System.out.println(STR."Pop method on the deck: \{messageStack.pop()}");
        print(messageStack);
        System.out.println(STR."Pop method on the deck: \{messageStack.pop()}");
        messageStack.push("Message 5");
        print(messageStack);
        System.out.println(STR."Peek method on the deck: \{messageStack.peek()}");
        print(messageStack);
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