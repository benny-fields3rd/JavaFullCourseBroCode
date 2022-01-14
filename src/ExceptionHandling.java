import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        // exception = 	an event that occurs during the execution of a program that,
        //				disrupts the normal flow of instructions

        Scanner scanner = new Scanner(System.in);

        try { // this helps handle the exception and prevents code from stopping program

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();
            int z = x / y;

            System.out.println("result: " + z);
        }
        catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero! IDIOT!");
        }
        catch (InputMismatchException e) {
            System.out.println("Hello!!!! Please enter a number!!!");
        }
        catch (Exception e) { // last resort, you should always handle exceptions individually as above.
            System.out.println("Something went wrong.");
        }
        finally { // a good use of using the finally block is to close scanners.
            System.out.println("This will always print.");
            scanner.close(); //ensure to move the scanner outside of the try block
        }




    }
}
