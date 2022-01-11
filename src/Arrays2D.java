public class Arrays2D {

    public static void main(String[] args) {

        // 2D Array = array of array (also known as multidimensional array

        // Create array that has 3 arrays and 3 elements arrays, one for

        // First way
        //String[][] cars = new String[3][3];

        // Second way of doing three arrays, one for each row.
        String[][] cars = {
                                {"Camaro","Corvette","Silverado"},
                                {"Volvo","Ranger","F-150"},
                                {"Ferrari","Lambo","Tesla"}
                            };
        // row 0 column 0
        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Volvo";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";

        // display all elements of 2D array using nested for loop
        // outer loop in charge of rows and inner in charge of columns

        for (int i =0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}
