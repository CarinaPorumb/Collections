package org.project.collection.list.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExercise3 {
    public static void main(String[] args) {

        String source = "there are both smaller and bigger words here";
        List<String> result = findFiveOrFewerLoop(source);
        List<String> result2 = findFiveOrFewerStream(source);
        System.out.println(STR."Words with five or fewer letters (Loop method): \{result}");
        System.out.println(STR."Words with five or fewer letters (Stream method): \{result2}");

    }

    // Returns words of five or fewer letters from the source string using a loop.
    private static List<String> findFiveOrFewerLoop(String source) {
        List<String> words = List.of(source.split("\\s"));
        List<String> filtered = new ArrayList<>();
        for (String word : words) {
            if (word.length() <= 5) {
                filtered.add(word);
            }
        }
        return filtered;
    }

    // Returns words of five or fewer letters from the source string using a stream.
    private static List<String> findFiveOrFewerStream(String source) {
        return Arrays.stream(source.split("\\s")).filter(w -> w.length() <= 5).toList();
    }

}