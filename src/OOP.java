public class OOP {

    public static void main(String[] args) {

        // object = an instance of a class that may contain attributes and methods
        // basically an object is a bundle of defining attributes and methods, the chracteristics of the object and what actions the object can perform
        // example: (pone, desk, computer, coffee cup)

        Car myCar1 = new Car(); // now myCar has the attributes we created in the Car class
        Car myCar2 = new Car(); // basically creates a new car, however this car will keep the same attributes
        // use constructor to create different cars

        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);

        //myCar1.drive();
        //myCar1.brake();

    }
}
