import java.util.Scanner;

public class MathClassHypotenuse {

    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();

        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        // formula to calculate hypotenuse and storing it in variable z
        z = Math.sqrt((x * x) + (y * y));
        System.out.println("The hypotenuse is: " + z);

        scanner.close(); // closes scanner - best practice but not necessary


    }

}
