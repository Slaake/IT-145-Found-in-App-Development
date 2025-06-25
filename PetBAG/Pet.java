// Shirl Lakeway
// IT-145 Project One Assignment

// Developed for Pet Boarding and Grooming (Pet BAG) company
// This Pet class will reference the java child classes of Dog and Cat.
// Reference the UML Class Diagram to review the relationships between the parent and child classes.

import java.util.Scanner;

public class Pet {
    public Scanner scanner = new Scanner(System.in);
    private String petType;
    private String petName;
    private int petAge;
    private int dogSpaces;
    private int catSpaces;
    private int daysStay;
    private double amountDue;

    // This is the default constructor for the pet class

    public Pet() {
        this.petType = "None";
        this.petName = "None";
        this.petAge = 0;
        this.dogSpaces = 0;
        this.catSpaces = 0;
        this.amountDue = 0.0;
    }

    // Constructor with parameters for the Pet class

    public Pet(String petType, String petName, int petAge, int daysStay, int dogSpaces, int catSpaces, double amountDue) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.daysStay = daysStay;
        this.dogSpaces = dogSpaces;
        this.catSpaces = catSpaces;
        this.amountDue = amountDue;
    }

    // Accessor methods to return variables from the child classes of Dog or Cat
    // These are not used at this time in the development of the check-in method

    public String getPetType() {
        return petType;
    }

    public String getPetName() {
        return petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public int getDogSpaces() {
        return dogSpaces;
    }

    public int getCatSpaces() {
        return catSpaces;
    }

    public int getDaysStay() {
        return daysStay;
    }

    public double getAmountDue() {
        return amountDue;
    }

    // Mutator methods

    public void setPetType() {
        System.out.println("Please enter what type of pet you are checking in: ");
        String petType = scanner.nextLine().toLowerCase();

        if (petType.equalsIgnoreCase("dog")) {
            this.petType = "dog";
            System.out.println("You have selected " + this.petType + " as the pet type."); // Validation
        } else if (petType.equalsIgnoreCase("cat")) {
            this.petType = "cat";
            System.out.println("You have selected " + this.petType + " as the pet type."); // Validation
        } else {
            System.out.println("Invalid pet Type! \nEnter \"cat\" or \"dog\"."); // Error handling
            setPetType();
        }
    }

    public void setPetName() {
        System.out.println("Please enter the Pet's name: ");
        this.petName = scanner.nextLine();
        System.out.println("Pet name set as: " + getPetName()); // Validation
    }

    public void setPetAge() {
        System.out.println("Enter pet age: ");
        int petAge = scanner.nextInt();
        if ((petAge<0) || (petAge > 99)) {
            System.out.println("ERROR: Enter a valid age 0-99:"); // Error handling
            setPetAge();
        } else {
            this.petAge = petAge;
            System.out.println("Pet Age set as " + getPetAge()); // Validation
        }
    }

    public void setDogSpaces(int dogSpaces) {
        this.dogSpaces = dogSpaces;
    }

    public void setCatSpaces(int catSpaces) {
        this.catSpaces = catSpaces;
    }

    public void setDaysStay(int daysStay) {
        System.out.println("How many days will the pet be staying?");
        this.daysStay = daysStay;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
}