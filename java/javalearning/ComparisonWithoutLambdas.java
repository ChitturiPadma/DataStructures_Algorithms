package com.expedia.java.demos.javalearning;

import com.clearspring.analytics.util.Lists;
import org.apache.hadoop.io.ShortWritable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparisonWithoutLambdas {

    public static void main(String[] args)
    {
        List<Human> humansList = new ArrayList<>();
        humansList.add(new Human("Padma", 29));
        humansList.add(new Human("Chitturi", 25));

        humansList.sort((h1, h2) -> (h1.getAge()>h2.getAge()) ? 1: 0) ;

       /* for(Human h:humansList)
            System.out.println("Human: Age: " + h.getAge() + ":Name:" + h.getName());*/

        // Sorting on Name
        humansList.sort((Human h1, Human h2) -> h1.getName().compareTo(h2.getName()));

        System.out.println("Sort with No Type Definitions..");
        for(Human h:humansList)
            System.out.println("Human: Name: " + h.getName() + ":Age:" + h.getAge());

        // Sort Using Reference to Static Method
        //humansList.sort(Human::compareByNameThenAge);


    }

    public static int compareByNameThenAge(Human h1, Human h2)
    {
        if(h1.getName().equals(h2.getName()))
            return Integer.compare(h1.getAge(), h2.getAge());
        else
            return h1.getName().compareTo(h2.getName());
    }


}
