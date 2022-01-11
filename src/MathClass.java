public class MathClass {

    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;
        System.out.println("double x is: " + x);
        System.out.println("double y is: " + y);
        // Math.
        // max() - finds larger of two numbers
        double max = Math.max(x, y);
        // min() - finds less of two numbers
        double min = Math.min(x, y);
        // sqrt() - finds sq root of a number
        double sqrt = Math.sqrt(y);
        // abs - finds the absolute value of a number, e.x -10 would be 10
        double abs = Math.abs(y);
        // rounds() - rounds a number
        double rnd = Math.round(y);
        // ceil() - always rounds up
        double ceil = Math.ceil(y);
        // floor() - rounds down4
        double flr = Math.floor(x);

        System.out.println("The max value of x and y is: " + max);
        System.out.println("The min value of x and y is: " + min);
        System.out.println("The square root of y is: " + sqrt);
        System.out.println("The absolute value of y is: " + abs);
        System.out.println("Math.round for y is: " + rnd);
        System.out.println("Using Math.ceil makes y: " + ceil);
        System.out.println("Using the Math.floor makes x: " + flr);

    }
}
