import java.util.Locale;

public class MethodChaining {

    public static void main(String[] args) {

        // method chaining = 	a common syntax for invoking multiple method calls in OOP
        //						condense code into less lines

        String name = "       Benny";
        /*
        // currently there are three methods below - we want to condense using method chaining
        name = name.concat(" Fields        ");
        name = name.toUpperCase();
        name = name.trim();
        */

        // using method chaining to create less lines of code - however it is not the easiest to read.
        // shown because we will come across this sometime
        name = name.concat(" Fields        ").toUpperCase().trim();

        System.out.println(name);


    }
}
