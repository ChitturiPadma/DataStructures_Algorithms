package com.expedia.java.demos.javalearning;


final class Cat
{
    String name;
    String features;
}
// Throws a compile time error. class declared as final cannot be extended
/*class BlackCat extends Cat
{

}*/

class Account
{
    String name;
    String contact;
    Account()
    {
        name = "DEFAULT";
        contact = "9944520932";
    }
    public final void display()
    {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
class PersonalAccount extends Account
{
    // Throws compile error as the method declared as final cannot be extended.
   /* public void display()
    {

    }*/
}

public class FinalKeyword {

    public static void main(String[] args)
    {
  final int i  = 0;
   // i = 10; // throws compile error as variable declared as final cannot be modified

        final Account account = new Account();
        //account = new Account(); // Reinstantiating the reference doesn't work. But its allowed to modify the properties of the object

        account.setContact("998820834");
        account.setName("PERSONAL");

        // Allowed to change the properties of the reference variable
        System.out.println("Account Name:" + account.getName() + ": Contact: " + account.getContact());




    }

    public void methodWithFinalArgs(final int x)
    {
        //x  = 1 // final local variable x cannot be re-assigned.
    }
}
