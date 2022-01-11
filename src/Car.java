public class Car {

    // define some attributes of a car
    String make = "Tesla";
    String model = "Model 3";
    String color = "midnight silver";
    int year = 2020;
    double price = 50000.00;

    // use method overriding using ToString
    public String toString() {
        // one way
        //String myString = make + "\n" + model + "\n" + color + "\n" + year;

        // better way
        return make + "\n" + model + "\n" + color + "\n" + year;
    }

    // define methods or actions for the car objects to perform

    /*
    void drive() {
        System.out.println("You drive the car.");
    }
    void brake() {
        System.out.println("You stepped on the brakes.");
    }

     */
}
