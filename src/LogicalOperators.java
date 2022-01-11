import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args) {

        // logical operators = used to connect two or more expressions
        //      && = (AND) both conditions must be true
        int temp = 25;

        if (temp > 30) {
            System.out.println("It is hot outside.");
        } else if (temp >= 20 && temp <=30 ) {
            System.out.println("It is warm outside.");
        } else {
            System.out.println("It is cold outside.");
        }
        //      || = (OR) either conditions must be true
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game. Press q or Q to quit.");
        String response = scanner.next(); // next stores the next key pressed into a String variable

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game.");
        } else {
            System.out.println("You are still playing the game.");
            scanner.close();
        }

        //      != = (NOT) reverses boolean value of condition
        System.out.println("You are still playing a game. Press q or Q to quit.");
        String response2 = scanner.next();
        if (!response2.equals("q") && !response2.equals("Q")) {
            System.out.println("You are still playing the game.");
        } else {
            System.out.println("You quit the game.");
            scanner.close();
        }
    }
}
