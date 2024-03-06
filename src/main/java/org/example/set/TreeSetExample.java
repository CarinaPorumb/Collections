package org.example.set;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(50, 150, 250, 100, 300, 200, 50, 150, 200);

        NavigableSet<Integer> numberTree = new TreeSet<>(numbers);

        System.out.println(STR. "\{numberTree} ");

        // numberTree.descendingSet().forEach(System.out::println);

        // numberTree.headSet(200).forEach(System.out::println);

        // numberTree.tailSet(200).forEach(System.out::println);

        // numberTree.subSet(100, 250).forEach(System.out::println);

        // Outputs the greatest element in this set strictly less than the given element
        System.out.println(numberTree.lower(200));

        // Outputs the least element in this set strictly greater than the given element
        System.out.println(numberTree.higher(200));

    }
}