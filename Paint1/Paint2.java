// @author Shirl Lakeway
// @version 1.0
// IT-145 Found in App Development

import java.util.Scanner;
import java.lang.Math;
// @see https://docs.oracle.com/javase/9/docs/api/java/lang/Math.html

public class Paint2 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's height
        System.out.println("Enter wall height (feet): ");
        wallHeight = scnr.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet): ");
        wallWidth = scnr.nextDouble();

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: "  + wallArea + " square feet");

        // Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calculate and output the number of paint cans needed to paint the wall,
        // rounded up to nearest integer
        // Complete this code block

        // The java.lang.Math.ceil() returns the double value that is greater than or equal 
        // to the argument and is equal to the nearest mathematical integer. 
    
        cansNeeded = Math.ceil(gallonsPaintNeeded / gallonsPerCan);
        // Used an if statement here to make the output account for plurals.
        if (cansNeeded == 1) {
            System.out.println(cansNeeded + " can needed to paint the walls");
        } else {
            System.out.println(cansNeeded + " cans needed to paint the walls");
        }
        System.out.println();

    }
}
