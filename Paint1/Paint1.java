// Shirl Lakeway
// IT-145 Found in App Development

import java.util.InputMismatchException;
import java.util.Scanner;

public class Paint1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        final double squareFeetPerGallons = 350.0;
        
        // While loop to check for correct values of an double as non-string value
        while (wallHeight == 0.0) {
            try {
                // Implement a do-while loop to ensure input is valid
                // Prompt user to input wall's height
                System.out.println("Enter wall height (feet): ");
                wallHeight = scnr.nextDouble();
                if (wallHeight <=0) {
                    System.out.println("Please input a number greater than zero");
                } 
                else {
                    continue;
                }               
            } 
            catch (InputMismatchException e) {
                System.out.println("Please use a numerical value!");
	        	scnr.nextLine();
            }
        }
        // While loop to check for correct values of an double as non-string value
        while (wallWidth == 0.0) {
            try {
                System.out.println("Enter wall width (feet): ");
                wallWidth = scnr.nextDouble();
                if (wallWidth <=0) {
                    System.out.println("Please input a number greater than zero");
                } 
                else {
                    continue;
                }               
            } 
            catch (InputMismatchException e) {
                System.out.println("Please use a numerical value!");
	        	scnr.nextLine();
            }
        }

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        return;
    }
}
