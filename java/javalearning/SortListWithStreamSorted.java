package com.expedia.java.demos.javalearning;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListWithStreamSorted {

    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        names.add("padma");
        names.add("ch");
        names.add("vikasch");

        //Sorting a List converting to a  Stream
        System.out.println("Sorting a List converting to a  Stream: ");
        List<String> namesSorted = names.stream().sorted().collect(Collectors.toList());
        for(String name:namesSorted)
            System.out.println("Name:" + name);

        // Sorting a List in reverse order
        System.out.println("Sorting a List converting to a Stream in Reverse Order: ");
       List<String> namesSortedReverse =  names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
       for(String s: namesSortedReverse)
           System.out.println("Name:" + s);

       List<Human> humansList = new ArrayList<>();
       humansList.add(new Human("padma", 29));
        humansList.add(new Human("ch", 25 ));
        humansList.add(new Human("chitturi", 27));

        List<Human> humansSortedAge = humansList.stream().sorted(Comparator.comparing(Human::getAge)).collect(Collectors.toList());
        System.out.println("Sorting Human List Stream on Age");
        for(Human h:humansSortedAge)
            System.out.println("Human: Name: "  + h.getName() + ":Age:" + h.getAge());

        // Sorting on Humans List in Reverse Order
        List<Human> humansSortedAgeReverse = humansList.stream().sorted(Comparator.comparing(Human::getAge, Comparator.reverseOrder()))
                .collect(Collectors.toList());
        System.out.println("Sorting Human List Stream on Age in Reverse Order");
        for(Human h: humansSortedAgeReverse)
            System.out.println("Human: Name: "  + h.getName() + ":Age:" + h.getAge());










    }
}
