import java.util.Locale;

public class StringClassMethods {

    public static void main(String[] args) {

        // String = a reference data type used to store one or more characters
        //          reference data types have access to useful methods

        String name = "Benny";

        // Below are some examples of using methods with the name variable. Expected result are commented next to each method
        //boolean result = name.equalsIgnoreCase("Benny"); //returns true
        int result = name.length(); // returns length of 5
        //char result = name.charAt(0); returns B since B is at index position 0
        //int result = name.indexOf("B"); // returns 0 since capital B is in the index position of 0
        //boolean result = name.isEmpty(); // returns false - since there is a name. If name variable was set to " " then it would be true.
        //String result = name.toUpperCase(); // returns BENNY
        //String result = name.toLowerCase(); // returns benny
        //String result = name.trim(); // returns Benny with no spaces before or after
        //String result = name.replace('e', 'o'); // returns Bonny

        System.out.println(result);

    }

}
