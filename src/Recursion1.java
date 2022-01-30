import java.util.Scanner;

public class Recursion1 {

    public static void main(String[] args) {

        // recursion = the process in which a method calls itself continuously
        // a method that calls itself is called a recursive method
        // useful for factorials, transversing trees, and simplifying a complex task

        // EXAMPLE 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times do you want to say Hello?: ");
        int number = scanner.nextInt();

        HelloWorld(number);

    }

    static void HelloWorld(int n) {
        if (n > 0) {
            System.out.println("Hello World." + n);
            n--;
            HelloWorld(n);
        }
    }
}
