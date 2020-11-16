package com.expedia.java.demos.javalearning;

class Base1
{
    public int calc(int a , int b)
    {
        return 0;
    }
}
class Derived1 extends Base1{
    @Override
    public int calc(int a , int b)
    {
        return 1;
    }
}
public class BaseClassDerivedClass_Function {

    public static void main(String[] args)
    {

        Derived1 d1 = new Derived1();
        System.out.println(d1.calc(0, 1));
    }
}
