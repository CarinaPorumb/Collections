package org.project.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {

        Set<String> colours = new HashSet<>(Set.of("Purple", "Yellow", "Orange", "Green", "Fuchsia", "Turquoise"));
        Set<String> warmColours = Set.of("Yellow", "Orange", "Red");
        Set<String> coolColours = Set.of("Blue", "Green", "Purple");

        Set<String> union = new HashSet<>(colours);
        union.addAll(warmColours);
        union.addAll(coolColours);
        System.out.println(STR."Union of the three Sets: \{union}");

        Set<String> warmOverlap = new HashSet<>(colours);
        warmOverlap.retainAll(warmColours);
        System.out.println(warmOverlap);

        Set<String> coolOverlap = new HashSet<>(colours);
        coolOverlap.retainAll(coolColours);
        System.out.println(coolOverlap);

        Set<String> combinedOverlap = new HashSet<>(warmOverlap);
        combinedOverlap.addAll(coolOverlap);
        System.out.println(STR."Combined overlap of colours: \{combinedOverlap}");

        Set<String> difference = new HashSet<>(colours);
        difference.removeAll(warmColours);
        difference.removeAll(coolColours);
        System.out.println(STR."Colors not classified as warm or cool: \{difference}");
    }
}