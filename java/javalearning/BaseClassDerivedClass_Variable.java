package com.expedia.java.demos.javalearning;

import org.apache.derby.shared.common.error.DerbySQLIntegrityConstraintViolationException;

class Base
{
    private int data;
    public Base()
    {
        data = 0;
    }

    public int getData() {
        return data;
    }

}
class Derived extends Base
{
    private int data;
    public Derived()
    {
        data = 6;
    }
    public int getData() {
        return data;
    }

}
public class BaseClassDerivedClass_Variable {
    public static void main(String[] args)
    {

        Derived d = new Derived();
        System.out.println(d.getData());
    }
}
