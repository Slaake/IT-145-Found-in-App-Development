// @author Shirl Lakeway
// @version 2.0
// IT-145 Found in App Development

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<>();

    public static void main(String[] args) {

        // Initalize Varibles
        Scanner scanner = new Scanner(System.in);
        initializeDogList();
        initializeMonkeyList();
        char input = 0;
        int input1 = Character.getNumericValue(input);
        boolean isValidSelection = true;
        boolean loopReset = false;  

        // Menu loop for the user to select what they would like to do
        while (!loopReset) {
            do {
                displayMenu();
                isValidSelection = true;
                try {
                    input = scanner.nextLine().charAt(0);
                    if (input == 'q') {
                        System.out.print("Thank you for using Grazioso Salvare Animal Tracking Software!");
                        loopReset = true;
                        break;
                    } else {
                        input1 = Character.getNumericValue(input);
                    }
                    if (input1 < 1 || input1 > 6)
                        throw new Exception("Invalid Entry. Please try again");
                } catch (Exception execpt) {
                    System.out.println(execpt.getMessage());
                    isValidSelection = false;
                }
            } while (!isValidSelection);
            //Switch statement to determine which menu option the user selected
            switch (input1) { 
                case 1 -> intakeNewDog(scanner);
                case 2 -> intakeNewMonkey(scanner);
                case 3 -> reserveAnimal(scanner);
                case 4 -> printDogs();
                case 5 -> printMonkey();
                case 6 -> printAnimals();
            }
        }
    }

    // This method prints the menu options to the user
    public static void displayMenu() {
        System.out.println("\n");
        System.out.println("\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    // Initial list of dogs
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "Intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "In Service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Inital list of monkeys
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Abe", "Capuchin", "5", "10", "7", "male", "3", "12", "01-02-2023", "United States", "Intake", false, "United States");
        Monkey monkey2 = new Monkey("Benny", "Guenon", "6", "11", "8", "female", "4", "13", "02-03-2024", "Germany", "Phase I", true, "United States");
        Monkey monkey3 = new Monkey("Carl", "Macaque", "7", "12", "9", "male", "5", "14", "05-06-2027", "Canada", "In Service", true, "United States");

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }

    // This is for intaking a new dog which adds to the dogList
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("This dog is already in our system, restarting checkin.\n");
                // Restart the intake process
                intakeNewDog(scanner);
            }
        }

        // Questions for inputing a new dog into the tracker

        // Ask user for dogs breed
        System.out.println("What is the dog's breed?"); 
        String breed = scanner.nextLine();

        // Ask user for dogs gender
        System.out.println("What is the dog's gender?"); 
        String gender = scanner.nextLine();

        // Ask user for dogs age
        System.out.println("What is the dog's age?"); 
        String age = scanner.nextLine();

        // Ask user for dogs weight
        System.out.println("What is the dog's weight?"); 
        String weight = scanner.nextLine();

        // Ask user for dogs acquisition date
        System.out.println("What is the dog's acquisition date?"); 
        String acqDate = scanner.nextLine();

        // Ask user for dogs acquisition country
        System.out.println("What is the dog's acquisition country?"); 
        String acqCountry = scanner.nextLine();

        // Ask user for dogs training status
        System.out.println("What is the dog's training status?");
        System.out.println("(Phase I, Phase II, Phase III or Phase IV)"); 
        String ts = scanner.nextLine();

        // Ask user for dogs reservation status
        System.out.println("Is the dog reserved (true or false)?");
        boolean res = scanner.nextBoolean();
        scanner.nextLine();

        // Ask user for dogs service country
        System.out.println("What is the dog's in service country?");
        String isc = scanner.nextLine();

        // Adds the new dog to the dogList
        Dog newdog = new Dog(name, breed, gender, age, weight, acqDate, acqCountry, ts, res, isc);
        dogList.add(newdog);
        System.out.println("The information has been successfully added.");
        return;
    }

        // This is for intaking a new monkey which adds to the monkeyList
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            for (Monkey monkey: monkeyList) {
                if (monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("This monkey is already in our system, restarting checkin.\n");
                    // Restart the intake process
                    intakeNewMonkey(scanner);
                }
            }
            System.out.println("What is the monkey's species?");
             System.out.println("(Capuchin, Guenon, Macaque, Marmoset, Squirrel Monkey or Tamarin)");
            String species = scanner.nextLine();

            // This for statement Checks if monkey species is allowed
            for (Monkey monkey: monkeyList) {
                if (!(species.equalsIgnoreCase("Capuchin")) && !(species.equalsIgnoreCase("Guenon")) && !(species.equalsIgnoreCase("Macaque")) && !(species.equalsIgnoreCase("Marmoset")) && !(species.equalsIgnoreCase("Squirrel Monkey")) && !(species.equalsIgnoreCase("Tamarin"))) {
                    System.out.println("Capuchin, Guenon, Macaque, Marmoset, Squirrel Monkey and Tamarin are only allowed!");
                    System.out.println("Restarting checkin process");
                    intakeNewMonkey(scanner);
                }

                //Prompt user for monkey's tail length
                System.out.println("What is the monkey's tail length?"); 
                String tailLength = scanner.nextLine();

                //Prompt user for monkey's height
                System.out.println("What is the monkey's height?"); 
                String height = scanner.nextLine();

                //Prompt user for monkey's body length
                System.out.println("What is the monkey's body length?"); 
                String bodyLength = scanner.nextLine();

                //Prompt user for monkey's gender
                System.out.println("What is the monkey's gender?"); 
                String gender = scanner.nextLine();

                //Prompt user for monkey's age
                System.out.println("What is the monkey's age?"); 
                String age = scanner.nextLine();

                //Prompt user for monkey's weight
                System.out.println("What is the monkey's weight?"); 
                String weight = scanner.nextLine();

                //Prompt user for monkey's acquisition date
                System.out.println("What is the monkey's acquisition date?"); 
                String acqDate = scanner.nextLine();

                //Prompt user for monkey's acquisition country
                System.out.println("What is the monkey's acquisition country?"); 
                String acqCountry = scanner.nextLine();

                //Prompt user for monkey's training status
                System.out.println("What is the monkey's training status?");
                System.out.println("(Phase I, Phase II, Phase III or Phase IV)");  
                String ts = scanner.nextLine();

                //Prompt user for monkey's reservation status
                System.out.println("Is the monkey reserved (true or false)?"); 
                boolean res = scanner.nextBoolean();
                scanner.nextLine();

                //Prompt user for monkey's service country
                System.out.println("What is the monkey's in service country?"); 
                String isc = scanner.nextLine();

                // Adds the new monkey to the monkeyList
                Monkey newMonkey = new Monkey(name, species, tailLength, height, bodyLength, gender, age, weight, acqDate, acqCountry, ts, res, isc);
                monkeyList.add(newMonkey);
                System.out.println("The information has been successfully added.");
                return;
            }
        }

    // This allows for reserving of an animal of dog or monkey. This checks againts the cooresponding dogList or monkeyList
    public static void reserveAnimal(Scanner scanner) {
        boolean isValidSelection = true;
        do {
            try {
                System.out.println("Enter animal type. Please use Monkey or Dog:");
                String type = scanner.nextLine();
                isValidSelection = true;

                // Error catching depending on user input
                if (type.equals("Monkey") || type.equals("monkey")) {
                    for (int i = 0; i < monkeyList.size(); i++) {
                        if (!monkeyList.get(i).getReserved())
                            System.out.println(monkeyList.get(i).getName() + " " + monkeyList.get(i).getInServiceCountry());
                    }
                    // Reserves the monkey choosen from the avilable list
                    System.out.println("Please enter the name of the monkey you wish to reserve:");
                    String name = scanner.nextLine();
                    for (Monkey obj : monkeyList) {
                        if (obj.getName().equals(name)) {
                            obj.setReserved(true);
                            System.out.println("Name of Monkey");
                            System.out.println(obj.getName());
                            System.out.print("Updated Reserved status: ");
                            System.out.println(obj.getReserved());
                            return;
                        } else {
                            throw new Exception("Invalid Entry. Please try again");
                        }
                    }

                // Error catching on user input
                } else if (type.equals("Dog") || type.equals("dog")) {
                    System.out.println("Name of Dog");
                    for (int i = 0; i < dogList.size(); ++i) {
                        if (!dogList.get(i).getReserved())
                            System.out.println(dogList.get(i).getName() + " " + dogList.get(i).getInServiceCountry());
                    }
                    // Reserves the dog from the avilable list
                    System.out.println("Please enter the name of the dog you wish to reserve:");
                    String name = scanner.nextLine();
                    for (Dog obj : dogList) {
                        if (obj.getName().equals(name)) {
                            obj.setReserved(true);
                            System.out.println("Name of Dog");
                            System.out.println(obj.getName());
                            System.out.print("Updated Reserved status: ");
                            System.out.println(obj.getReserved());
                            return;
                        } else
                            throw new Exception("Invalid Entry. Please try again");
                    }
                } else
                    throw new Exception("Invalid Entry. Please try again");
            } catch (Exception execpt) {
                System.out.println(execpt.getMessage());
                isValidSelection = false;
            }
        } while (!isValidSelection);
    }

    // Loop to print out dog information from the list
    public static void printDogs() {
        System.out.println("Name | " + "Training Status | " + "Age | " + "Breed | " + "Reserved Status");
        for (int i = 0; i < dogList.size(); i++) {
            System.out.print(dogList.get(i).getName());
            System.out.print(" | ");
            System.out.print(dogList.get(i).getTrainingStatus());
            System.out.print(" | ");
            System.out.print(dogList.get(i).getAge());
            System.out.print(" | ");
            System.out.print(dogList.get(i).getBreed());
            System.out.print(" | ");
            System.out.println(dogList.get(i).getReserved());
        }
    }

    // Loop to print out monkey information from the list
    public static void printMonkey() {
        System.out.println("Name | " + "Training Status | " + "Age | " + "Species | "+ "Reserved Status");
        for (int i = 0; i < monkeyList.size(); i++) {
            System.out.print(monkeyList.get(i).getName());
            System.out.print(" | ");
            System.out.print(monkeyList.get(i).getTrainingStatus());
            System.out.print(" | ");
            System.out.print(monkeyList.get(i).getAge());
            System.out.print(" | ");
            System.out.print(monkeyList.get(i).getSpecies());
            System.out.print(" | ");
            System.out.println(monkeyList.get(i).getReserved());
        }
    }

    // Loop to print out information from both dog and monkey lists
    public static void printAnimals() {
        System.out.println("Name of Animal");
        System.out.println("\t\tDogs");
        for (int i = 0; i < dogList.size(); ++i) {
            if (dogList.get(i).getReserved() == true && dogList.get(i).getTrainingStatus().equals("In Service"))
                System.out.println(dogList.get(i).getName() + " " + dogList.get(i).getBreed());
        }
        System.out.println("\t\tMonkeys");
        for (int i = 0; i < monkeyList.size(); ++i) {
            if (monkeyList.get(i).getReserved() == true && monkeyList.get(i).getTrainingStatus().equals("In Service"))
                System.out.println(monkeyList.get(i).getName() + " " + monkeyList.get(i).getSpecies());
        }
    }
}


