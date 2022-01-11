public class Switch {

    public static void main(String[] args) {

        // switch = statement that allows a variable to be tested for equality against a list of values
        // ideal for if you find yourself using a lot of if and ele statements

        String day = "Fday";

        switch (day) {
            case "Sunday":
                System.out.println("It is Monday!");
                break; // breaks are important, without the breaks, each sout would process
            case "Monday":
                System.out.println("It is Monday!");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday!");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday!");
                break;
            case "Thursday":
                System.out.println("It is Thursday!");
                break;
            case "Friday":
                System.out.println("It is Friday!");
                break;
            case "Saturday":
                System.out.println("It is Saturday!");
                break;
            default: // if no matches, do the following
                System.out.println("That is not a day!");
        }

        // enhanced switch looks like this:
        /*
        switch (day) {
            case "Sunday" -> System.out.println("It is Monday!");
            // breaks are important, without the breaks, each sout would process
            case "Monday" -> System.out.println("It is Monday!");
            case "Tuesday" -> System.out.println("It is Tuesday!");
            case "Wednesday" -> System.out.println("It is Wednesday!");
            case "Thursday" -> System.out.println("It is Thursday!");
            case "Friday" -> System.out.println("It is Friday!");
            case "Saturday" -> System.out.println("It is Saturday!");
            default -> // if no matches, do the following
                    System.out.println("That is not a day!");
        }
        */


    }

}
