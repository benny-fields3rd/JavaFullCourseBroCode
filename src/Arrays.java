public class Arrays {

    public static void main(String[] args) {

        // array = used to store multiple values in a single variable
        // Note: when assign values, they all have to be the same datatype..cant mix Strings with ints, etc.
        // basic structure of array
        String[] cars = {"Camaro","Corvette","Tesla","BMW"};
        cars[0] = "Mustang";
        System.out.println(cars[3]); //BMW

        // additional/better way of creating an array allocating amount of elements needed and then storing values
        String[] automobiles = new String[3]; // displays BMW since it is in index 3

        automobiles[0] = "Camaro";
        automobiles[1] = "Corvette";
        automobiles[2] = "Tesla";

        System.out.println(automobiles[1]); // displays Corvette since it is in index 1

        // Using for loop to iterate array elements and print elements of array
        for (int i = 0; i < automobiles.length; i++) {
            System.out.println("The array of automobiles contains: " + automobiles[i]);
        }
    }
}
