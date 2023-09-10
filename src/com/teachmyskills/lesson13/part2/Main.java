package com.teachmyskills.lesson13.part2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>() {
            {
                add("Andrew Reut");
                add("Dovlet Atakishiev");
                add("Andrey Troan");
                add("Gleb Yurchuk");
                add("Aleksander Grouzdev");
                add("Aleksei Gorbal");
                add("Vladimir Bashlikov");
                add("Vladislav Losik");
                add("Dmitry Kripan");
                add("Roman Belov");
                add("Tatyana Yurkevich");
            }
        };

        System.out.println(arrayList.stream().filter(n -> n.toLowerCase().startsWith("a")).toList());
        System.out.println(arrayList.stream().sorted().limit(1).toList());
    }
}