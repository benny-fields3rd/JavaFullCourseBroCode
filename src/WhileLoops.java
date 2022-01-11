import java.util.Scanner;

public class WhileLoops {

    public static void main(String[] args) {

        // while loop = executes a block of code as long as it's condition remains true
        // basically, it will continue to run until the condition is true
        Scanner scanner = new Scanner(System.in);
        String name = "";
        // below will continue to prompt you to enter your name until you do.
        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();;
        }
        System.out.println("Hello " + name);

        // do loop is a variation of the while loop
        // move condition to end of block of code and precede the code with do
        // do loops executes a block of code at least once and then checks the condition at the end
        String color = "";
        // below will continue to prompt you to enter your color until you do.
        do {
            System.out.print("Enter your color: ");
            color = scanner.nextLine();;
        }  while (color.isBlank());
        System.out.println("Your color is: " + color);
    }
}
