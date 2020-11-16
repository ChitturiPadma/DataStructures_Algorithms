package com.expedia.java.demos.javalearning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class IncorrectFileNameException extends Exception
{
    public IncorrectFileNameException(String errorMessage, Throwable err)
    {
        super(errorMessage, err);
        System.out.println("In IncorrectFileNameException class");

    }
}
public class CustomExceptionHandling {

    public static void main(String[] args) throws IncorrectFileNameException
    {
       int score = getPlayerScore("/Users/pchitturi/homeaway_projects/MKTINS-113/scored_file.txt");
       System.out.println(score);

    }

    public static int getPlayerScore(String playerFile) throws IncorrectFileNameException
    {
        try
        {
            Scanner contents = new Scanner(new File(playerFile));
            return Integer.parseInt(contents.nextLine());
        }
        catch(FileNotFoundException fileNotFoundException)
        {
            throw  new IncorrectFileNameException("File Not Found", fileNotFoundException);
        }
    }

}
