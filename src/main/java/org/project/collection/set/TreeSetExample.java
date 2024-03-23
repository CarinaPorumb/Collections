package org.project.collection.set;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        List<Integer> numbersList = new ArrayList<>(List.of(5, 10, 20, 15, 10, 25, 50, 30, 5, 50));
        System.out.println(STR."Numbers ArrayList: \{numbersList} ");

        TreeSet<Integer> numbers = new TreeSet<>(numbersList);
        System.out.println(STR."Numbers TreeSet: \{numbers} ");

        TreeSet<Integer> reversedNumbers = (TreeSet<Integer>) numbers.descendingSet();
        System.out.println(STR."Reversed Numbers TreeSet: \{reversedNumbers} ");

        // Outputs the greatest element in this set strictly less than the given element
        System.out.println(STR."Lower than 17: \{numbers.lower(17)}");
        // Outputs the least element in this set strictly greater than the given element
        System.out.println(STR."Higher than 22: \{numbers.higher(22)}");

        System.out.println(STR."HeadSet of 25: \{numbers.headSet(25)}");
        System.out.println(STR."HeadSet of 25 (inclusive): \{numbers.headSet(25, true)}");
        System.out.println(STR."SubSet from 10 to 30: \{numbers.subSet(10, 30)}");
        System.out.println(STR."Ceiling of 16: \{numbers.ceiling(16)}");
        System.out.println(STR."TailSet of 15: \{numbers.tailSet(15)}");
        System.out.println(STR."TailSet of 15 (exclusive): \{numbers.tailSet(15, false)}");
        System.out.println(STR."First Number: \{numbers.first()}");
        System.out.println(STR."Last Number: \{numbers.last()}");
        System.out.println(STR."Floor of 21: \{numbers.floor(21)}");
        System.out.println(STR."Floor of 14: \{numbers.floor(14)}");

        System.out.println(STR."Before polling first and last: \{numbers}");
        System.out.println(STR."PollFirst (removed): \{numbers.pollFirst()}");
        System.out.println(STR."PollLast (removed): \{numbers.pollLast()}");
        System.out.println(STR."After polling first and last: \{numbers}");

        System.out.println(STR."Remove 25: \{numbers.remove(25)}");
        System.out.println(STR."After removal: \{numbers}");

        reversedNumbers.clear();
        System.out.println(STR."After clear: \{reversedNumbers}");

        TreeSet<Integer> clonedNumbers = new TreeSet<>(numbersList);
        System.out.println(STR."Cloned TreeSet: \{clonedNumbers}");
        clonedNumbers.add(75);
        clonedNumbers.add(100);

        System.out.println(STR."Cloned numbers after adding '75 and 100': \{clonedNumbers}");
        System.out.println(STR."Original equals reversed? \{numbers.equals(clonedNumbers)}");
        System.out.println(STR."Cloned contains all original? \{clonedNumbers.containsAll(numbers)}");

    }
}