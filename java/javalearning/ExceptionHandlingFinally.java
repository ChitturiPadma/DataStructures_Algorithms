package com.expedia.java.demos.javalearning;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandlingFinally {
    public static void main(String[] args)
    {

    }

    // finally block executes regardless of what happens with try block
    public int getPlayerScore(String playerFile)
    {
        Scanner contentFile = null;
      try
      {
          contentFile = new Scanner(new File(playerFile));
          return Integer.parseInt(contentFile.nextLine());

      }
      catch(FileNotFoundException fileNotFoundException)
      {
          throw  new IllegalArgumentException("File Not Found");
      }
      finally {
          try
          {
              if(contentFile != null)
                  contentFile.close();
          }
          catch (Exception exception)
          {
              System.out.println(exception.getMessage());
          }
      }
    }

    // Multiple Catch blocks
    public int getPlayerScoreMultipleCatchBlocks(String playerFile) {
        try (Scanner contents = new Scanner(new File(playerFile))) {
            return Integer.parseInt(contents.nextLine());
        } catch (IOException e) {
            System.out.println("Player file wouldn't load!");
            return 0;
        } catch (NumberFormatException e) {
            System.out.println("Player file was corrupted!");
            return 0;
        }
    }
}
