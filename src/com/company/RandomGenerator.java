package com.company;

/* RandomGenerator.java
    This program should generate 10 random integers from 1 to 6. Fix it so that it works...
*/

// Since Random is a class, change lowercase r to uppercase R
import java.util.Random;

public class RandomGenerator{
    public static void main(String[] args)
    {
        // Change "0 and 6" to "1 and 6"
        output("Generate 10 random integers between 1 and 6");
        // Create Random object with new keyword and default constructor
        Random rnd = new Random();

        /* Change condition in for loop from "i <= 12" to "i <= 10"
            to generate 10 random numbers
        */
        for (int i = 1; i <= 10; ++i)
        {
            /* Change parameter in nextInt method to 6
                so that random numbers come from 1 to 6.
            */
            int randomInt = 1 + rnd.nextInt(6);
            output("Generated number: " + randomInt);
        }

        output("Done.");
    }

    private static void output(String aMessage)
    {
        System.out.println(aMessage);
    }
}