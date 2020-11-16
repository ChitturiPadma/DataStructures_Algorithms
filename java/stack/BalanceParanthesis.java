package com.expedia.java.demos.ds.stack;

import java.util.ArrayDeque;

public class BalanceParanthesis {

    public static void main(String[] args)
    {
        ArrayDeque<String> stack = new ArrayDeque<>();
        //String[] paranthesis = new String[]{"(", "{", "}", "(", ")", "[", "]", ")"};
        String[] paranthesis = new String[]{"(", "(", "(", ")", ")"};

        boolean isBalanaced = true ;

        for(String s:paranthesis)
        {
            switch (s)
            {
                case "(": case  "{": case "[":

                    stack.push(s);
                    break;

                case ")":

                    if(!stack.isEmpty()) {
                        String topElement = stack.peek();
                        if (!topElement.equals("(")) {
                            isBalanaced = false;
                            break;
                            // return;
                        } else
                            stack.pop();


                    }
                    else
                    {
                        isBalanaced = false;
                        break;
                    }
                    break;


                case "}" :

                    if(!stack.isEmpty()) {
                        String topElement2 = stack.peek();
                        if(!topElement2.equals("{"))
                        {
                            isBalanaced = false;
                            break;
                        }
                        else
                            stack.pop();
                    }

                    else
                    {
                        isBalanaced = false;
                        break;
                    }
                    break;



                case "]" :

                    if(!stack.isEmpty()) {

                        String topElement3 = stack.peek();
                        if(!topElement3.equals("["))
                        {
                            isBalanaced = false;
                            break;
                        }
                        else
                            stack.pop();
                    }

                    else
                    {
                        isBalanaced = false;
                        break;
                    }
                    break;


                default:

                    System.out.println("Please give valid input ");

            }

        }


        if(isBalanaced && stack.isEmpty())
            System.out.println("Paranthesis is Balanced");

        else
            System.out.println("Paranthesis is not Balanced");

    }
}
