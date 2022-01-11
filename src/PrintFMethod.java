public class PrintFMethod {

    public static void main(String[] args) {

        // printf() = 	an optional method to control, format, and display text to the console window
        //				two arguments = format string + (object/variable/value)
        //				% [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Benny";
        int myInt = 50;
        double myDouble = 1000;

        // conversion-character USING %n FOR NEW LINE
        System.out.printf("%b%n", myBoolean); //% is example of format specifier, using d is for decimals
        System.out.printf("%c%n", myChar);
        System.out.printf("%s%n", myString);
        System.out.printf("%d%n", myInt);
        System.out.printf("%f%n", myDouble);

        //[width]
        // minimum number of characters to be written as output
        System.out.printf("Hello %10s%n", myString); // prints a minimum of 10 characters

        //[precision]
        // sets number of digits of precision when outputting floating-point values
        System.out.println();
        System.out.printf("You have this much money %.2f%n", myDouble); //the .2 creates 2 digits after the .
        System.out.println("Last line");

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000
        System.out.printf("You have this much money %-20f%n", myDouble); // - : left-justify
        System.out.printf("You have this much money %20f%n", myDouble); // - : right-justify
        System.out.printf("You have this much money %+f%n", myDouble); // outputting a plus or minus
        System.out.printf("You have this much money %020f%n", myDouble); // padding, adding zeros before number
        System.out.printf("You have this much money %,f%n", myDouble); // adding comma for numbers over 1000

    }
}
