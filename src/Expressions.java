public class Expressions {

    public static void main(String[] args) {

        // expression = operands & operators
        // operands = values, variables, numbers, quantity
        // operators =
            // + add
            // - subtract
            // * multiply
            // / divide
            // % modulus

        int friends = 10;

        friends = friends + 1; // or friends++;
        //friends = friends - 1; // or friends--;

        // integer division - if number is divided by integer, and there is normally a remainder, the program will truncate the remainder.
        // For instance if we take our friends and divide by 3, we should get 3.33, but instead we get just 3.
        // friends = friends / 3;
        // An easy fix is to cast as a double value or a float and also change the data type of the variable from int to double. i.e double friends = 10;

        // friends = (double) friends / 3;


        System.out.println(friends);


    }

}
