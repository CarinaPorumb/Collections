package org.project.collection.list.arrayList;

import java.util.Arrays;

public class ArrayListExercise2 {
    public static void main(String[] args) {

        String source = "Here is an example. Right here.";
        String word = "here";
        int result = getOccurrencesLoop(source, word);
        int result2 = getOccurrencesStream(source, word);
        System.out.println(STR."Occurrences using loop: \{result}");
        System.out.println(STR."Occurrences using stream: \{result2}");

    }


    // Returns the number of occurrences of the specified word in the source string, using a loop.
    public static int getOccurrencesLoop(String source, String word) {
        int count = 0;
        String cleanSource = source.replaceAll("\\.", " ");
        String[] words = cleanSource.split("\\s+");

        for (String elem : words) {
            if (elem.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }


    // Returns the number of occurrences of the specified word in the source string, using a stream.
    public static int getOccurrencesStream(String source, String word) {
        String cleanUpString = source.replaceAll("\\.", " ");

        return (int) Arrays.stream(cleanUpString.split("\\s+"))
                .filter(w -> w.equalsIgnoreCase(word))
                .count();
    }

}