package com.expedia.java.demos.javalearning;

class ClassOne
{


    private int oneValue;
    private ClassTwo classTwo;

   public ClassOne()
    {
        oneValue = 1;

        classTwo = new ClassTwo();
    }

    public int getOneValue() {
        return oneValue;
    }

}

class ClassTwo
{
    private int twoValue;
    private ClassOne classOne;
    public ClassTwo()
    {
        twoValue = 2;
        classOne = new ClassOne();
    }


}
public class StackOverflowErrorCyclicDependency {

    public static void main(String[] args)
    {
        ClassOne cOne = new ClassOne();

        System.out.println(cOne.getOneValue());


    }
}
