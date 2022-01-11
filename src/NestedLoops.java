import java.util.Scanner;

public class NestedLoops {

    public static void main(String[] args) {

        // nested loops = loop inside of a loop

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter a number of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter a number of columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter a symbol to use: ");
        symbol = scanner.next();

        // loops : outer loop wil be in charge of rows and inner loop in charge of columns
        for (int i = 1; i <= rows; i++) {  // this for in charge of rows
            System.out.println(); //move cursur down to next row/line
            for (int j = 1; j <= columns; j++) { // this for is in charge of columns
                System.out.print(symbol);
            }
        }
    }

}
