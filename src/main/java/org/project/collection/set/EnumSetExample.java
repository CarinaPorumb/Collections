package org.project.collection.set;

import java.util.EnumSet;

public class EnumSetExample {
    public static void main(String[] args) {

        //  allOf(Class<E> elementType): Creates an EnumSet containing all of the elements in the specified element type.
        //  This is useful when you want to include every constant from a particular enum.
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println(STR."All days of the week: \{allDays}");

        allDays.remove(Day.SUNDAY);
        System.out.println(STR."After removing Sunday: \{allDays}");

        //of(E first, E... rest): Creates an EnumSet initially containing the specified elements. This method is handy for
        // creating a set with one or more specific enum constants.
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        System.out.println(STR."Weekend days: \{weekend}");


        //noneOf(Class<E> elementType): Creates an empty EnumSet with the specified element type.
        // It's useful when you want to start with an empty set and conditionally add elements.
        EnumSet<Day> noDays = EnumSet.noneOf(Day.class);
        System.out.println(STR."Empty set of days: \{noDays}");


        //range(E from, E to): Creates an EnumSet containing all of the elements in the range defined by the two
        // specified endpoints. This is perfect for creating a set that represents a range within the enum constants.
        EnumSet<Day> workweek = EnumSet.range(Day.MONDAY, Day.FRIDAY);
        System.out.println(STR."Workweek days: \{workweek}");


        //complementOf(EnumSet<E> s): Creates an EnumSet containing all the elements of the enum type that are not
        // in the specified set. This method is useful for creating a set that represents the inverse of another set.

        EnumSet<Day> nonWorkdays = EnumSet.complementOf(workweek);
        System.out.println(STR."Non-workdays: \{nonWorkdays}");

    }

}
