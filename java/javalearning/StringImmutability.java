package com.expedia.java.demos.javalearning;

public class StringImmutability {

    public static void main(String[] args)
    {
        String s1 = "Padma";
        String s2 = "Padma";
        if(s1 == s2)
            System.out.println("s1==s2");
        if(s1.equals(s2))
            System.out.println("s1.equals(s2)");

        String s3 = new String("HELLO");
        String s4 = new String("HELLO");

        if(s3 == s4 ) // == is operator used for reference comparison
            System.out.println("s3==s4");
        if(s3.equals(s4)) // .equals is method used for content comparison
            System.out.println("s3.equals(s4)");





    }
}
