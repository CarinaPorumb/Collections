package org.project.collection.list.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise4 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(7, 17, 13, 19, 5);

        List<Integer> reversed = getReversed(numbers);
        System.out.println(STR."Reversed list: \{reversed}");


        double average1 = getAverageLoop(numbers);
        double average2 = getAverageByStream(numbers);
        double average3 = getAverageByIntStream(numbers);
        System.out.println(STR."Average calculated with loop: \{average1}");
        System.out.println(STR."Average calculated with stream reduction: \{average2}");
        System.out.println(STR."Average calculated with IntStream mapToInt: \{average3}");


    }

    private static List<Integer> getReversed(List<Integer> source) {
        List<Integer> numbers = new ArrayList<>(source);
        Collections.reverse(numbers);
        return numbers;
    }


    // Calculates average using a loop
    static double getAverageLoop(List<Integer> source) {
        if (source == null || source.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (Integer number : source) {
            sum += number;
        }
        return sum / source.size();
    }


    // Calculates average using stream reduction
    static double getAverageByStream(List<Integer> source) {
        if (source == null || source.isEmpty()) {
            return 0;
        }
        return (double) source.stream().reduce(0, Integer::sum) / source.size();
    }


    // Calculates average using IntStream mapToInt and average methods
    static double getAverageByIntStream(List<Integer> source) {
        if (source == null || source.isEmpty()) {
            return 0;
        }
        return source.stream().mapToInt(Integer::intValue).average().orElse(0);
    }


}