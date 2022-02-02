import java.util.SortedMap;

public class Generics {

    public static void main(String[] args) {

        // generics =       enable types (classes and interfaces) to be parameters when defining:
        //                  classes, interfaces, and methods
        //                  a benefit is to eliminate the need to create multiple versions
        //                  of methods or classes for various data types.
        //                  Use 1 version for all reference data types

        // various reference data type arrays using wrapper class
        Integer[] intArray = {1, 2, 3, 4, 5,};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'J','A', 'V', 'A'};
        String[] stringArray = {"R", "O", "C", "K", "S"};

        /*
        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);
        */


        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));
    }
    /*
    // create method to display array for each data type array
    // old way: create one method for each datatype (commented out three of them)
    public static void displayArray(Integer[] array) {

        for (Integer x : array) {
            System.out.print(x + " ");
        }
        System.out.println();

    }

    public static void displayArray(Double[] array) {

        for (Double x : array) {
            System.out.print(x + " ");
        }
        System.out.println();

    }

    public static void displayArray(Character[] array) {

        for (Character x : array) {
            System.out.print(x + " ");
        }
        System.out.println();

    }

    public static void displayArray(String[] array) {

        for (String x : array) {
            System.out.print(x + " ");
        }
        System.out.println();

    }

     */

    // use generics - does the same things and prints each array - accepting all reference data types
    // usually you will see a T inside the <> i.e. <T>
    public static <Thing> void displayArray(Thing[] array) {

        for (Thing x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static <Thing> Thing getFirst(Thing[] array) {
        return array[0];
    }

}
