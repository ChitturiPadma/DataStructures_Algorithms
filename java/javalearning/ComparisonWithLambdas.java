package com.expedia.java.demos.javalearning;

import com.clearspring.analytics.util.Lists;

import java.util.*;

class Human
{
    private String name;
    private int age;

    public Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


public class ComparisonWithLambdas {


    public static void main(String[] args)
    {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Padma", 29));
        humans.add(new Human("Chitturi", 18));


        Collections.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                boolean compareBool = o1.getAge() < o2.getAge();
                return (compareBool) ? 1: 0;
            }
        });

        for(Human h:humans)
            System.out.println("Human: " + h.getName() + ":" + h.getAge());



    }
}
