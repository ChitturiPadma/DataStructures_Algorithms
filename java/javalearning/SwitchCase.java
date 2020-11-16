package com.expedia.java.demos.javalearning;

public class SwitchCase {

    /*
    1. switch cannot take null values
    2. case values when using variables, need to have variables declared as final
     */
    public static void main(String[] args)
    {
        String animal = "DOG";

        final String dog = "DOG";
        String cat = "CAT";

        switch (animal)
        {
            case "DOG" : System.out.println("Variable is DOG");
            break;
            case "CAT" :  System.out.println("Variable is CAT");
            break;
            default:
                System.out.println("Default");
        }

        switch (animal)
        {
            case dog : System.out.println("Variable is DOG");
                break;
           /* case cat :  System.out.println("Variable is CAT"); // throws compile time error since cat is not a final variable
                break;*/
            default:
                System.out.println("Default");
        }


    }
}
