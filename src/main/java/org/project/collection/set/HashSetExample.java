package org.project.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {

        Set<String> countries = new HashSet<>();
        countries.add("France");
        countries.add("Portugal");
        countries.add("Japan");
        countries.add("Italy");
        System.out.println(STR."Initial set of countries: \{countries}");

        System.out.print("Countries listed with foreach loop: ");
        for (String country : countries) {
            System.out.print(STR."\{country} ~ ");
        }
        System.out.println();

        System.out.println(STR."Number of countries in the set: \{countries.size()}");
        System.out.println(STR."Is the set empty? \{countries.isEmpty()}");

        Set<String> clonedCountries = new HashSet<>(countries);
        System.out.println(STR."Cloned set of countries: \{clonedCountries}");

        String[] countryArray = clonedCountries.toArray(new String[0]);
        System.out.print("Countries array: ");
        for (String country : countryArray) {
            System.out.print(STR."\{country} ");
        }
        System.out.println();


        Set<String> treeSetCountries = new TreeSet<>(countries);
        System.out.println(STR."Countries sorted in a TreeSet: \{treeSetCountries}");


        ArrayList<String> arrayListCountries = new ArrayList<>(countries);
        System.out.println(STR."Countries in an ArrayList: \{arrayListCountries}");
        for (int i = 0; i < arrayListCountries.size(); i++) {
            System.out.println(STR."Position \{i}: \{arrayListCountries.get(i)}");
        }

        Set<String> countries2 = new HashSet<>();
        countries2.add("Australia");
        countries2.add("Iceland");
        countries2.add("New Zealand");
        countries2.add("Japan");
        countries2.add("France");

        System.out.println(STR."Does the original set contain all of the second set? \{countries.containsAll(countries2)}");
        System.out.println(STR."Is the original set equal to the second set? \{countries.equals(countries2)}");

        clonedCountries.retainAll(countries2);
        System.out.println(STR."Common elements between the original and second set: \{clonedCountries}");

        clonedCountries.clear();
        System.out.println(STR."Cloned set after clearing: \{clonedCountries}");

        countries.removeAll(countries2);
        System.out.println(countries);
        System.out.println(countries2);
        System.out.println(STR."Original set after removing elements that are also in the second set: \{countries}");

    }

}