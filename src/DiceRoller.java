import java.util.Random;

public class DiceRoller {

    // example of global variables to be accessed by any methods
    Random random;
    int number;

    DiceRoller() {
        random = new Random(); // if you declare inside the method, it cannot be used outside of method i.e. Random random = new Random()
        number = 0;
        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

}
