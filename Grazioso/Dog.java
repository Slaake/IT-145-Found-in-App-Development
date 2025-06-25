// @author Shirl Lakeway
// @version 2.0
// IT-145 Found in App Development

// The Dog class extends the RescueAnimal class.
// This class stores infomration related to a monkey that is/has been checked in though the Grazioso Salvare Software

public class Dog extends RescueAnimal {

    // Instance variable
    private String breed;

    // Constructor
    public Dog(String name, String breed, String gender, String age,
        String weight, String acquisitionDate, String acquisitionCountry,
	    String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
		setAnimalType("dog"); // This line ensures animalType is set.

    }

    // Accessor Method
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }

}
