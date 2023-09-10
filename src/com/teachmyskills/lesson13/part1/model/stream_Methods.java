package com.teachmyskills.lesson13.part1.model;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class stream_Methods {
    public static void removesDuplicates() {
        System.out.println("Collection without duplicates: " + arrayList().stream().distinct().toList());
    }

    public static void multiplication() {
        System.out.println("Result of multiplication by two: " + arrayList().stream().map(n -> n * 2).toList());
    }

    public static void displaysRange() {
        System.out.println("Interval between 7 and 17: " + arrayList().stream().filter(n -> n >= 7 && n <= 17).toList());
    }

    public static void printTheFirstFourValues() {
        System.out.println("First four numbers: " + arrayList().stream().sorted().limit(4).toList());
    }

    public static void displaysTheNumbersOfElements() {
        System.out.println("Number of elements in collection: " + arrayList().stream().count());
    }

    public static void displaysTheAverage() {
        System.out.println("Average value: " + arrayList().stream().collect(Collectors.averagingInt(Integer::intValue)));
    }

    public static ArrayList<Integer> arrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>() {
            {
                for (int i = 0; i < 5; i++) {
                    add((int) (Math.random() * 20));
                }
            }
        };

        return arrayList;
    }
}

