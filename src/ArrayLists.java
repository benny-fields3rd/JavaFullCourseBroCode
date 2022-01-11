import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        // ArrayList = 	a resizable array.
        //				Elements can be added and removed after compilation phase
        //				store reference data types
        //              Must use Wrapper class Integer, String, Double, etc inside <>
        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "sushi"); // replaces index with value
        food.remove(2); // removes index and value
        food.clear(); // erases array values

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

    }

}
