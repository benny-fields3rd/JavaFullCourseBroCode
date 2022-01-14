import package2.C;

import java.util.Scanner;

public class PolymorphismDynamic {

    // polymorphism = many shapes/forms
    // dynamic = after completion (during runtime)

    // example: A corvette is a: corvette, and a car, and a vehicle, and an object
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Animal animal; // declare an object even if you don't know what type of object you want yet. For this example, we declared animal before we created the type of animal (dog, cat, etc.)

        System.out.println("What animal would you like?");
        System.out.println("(1=dog) or (2=cat): ");
        int choice = scanner.nextInt();

        if(choice == 1) {
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("That choice was invalid.");
            animal.speak();
        }
    }



}
