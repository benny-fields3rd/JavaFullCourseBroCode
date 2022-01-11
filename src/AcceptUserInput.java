import java.util.Scanner;

public class AcceptUserInput {

    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine(); // without this, if you were to try and run another scanner, the code would read the /n and
                            // not allow you to enter any input.

        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite food is " + food );



    }

}
