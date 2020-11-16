package com.expedia.java.demos.javalearning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args)
    {

    }

    // Handle a checked-exception by rethrowing it. Caller method needs to handle this exception
    public int getPlayerScore(String playerFile) throws FileNotFoundException
    {
        Scanner fileContent = new Scanner(new File(playerFile));

        return Integer.parseInt(fileContent.nextLine());
    }

    // Handle checked- exception through try- catch block and rethrowing the excpetion from catch
    public int getPlayerScoreTryCatch(String playerFile)
    {
        try
        {
            Scanner fileContent = new Scanner(new File(playerFile));
            return Integer.parseInt(fileContent.nextLine());

        }
        catch(FileNotFoundException fileNotFoundException)
        {
            System.out.println("Exception: " + fileNotFoundException.getMessage());
            throw new IllegalArgumentException("File Not Found ");

        }
    }




}
