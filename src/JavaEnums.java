// you can create enum here or in another file
enum Planet{ // values are called constants
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    URANUS(6),
    SATURN(7),
    NEPTUNE(8),
    PLUTO(9);

    int number;

    Planet(int number) {
        this.number = number;
    }
}

public class JavaEnums {

    public static void main(String[] args) {

        //enum = enumerated (ordered listing of items in a collection)
        //grouping of constants that behave similarly to objects

        // We will create a program to check if one of the planets is inhabitable

        Planet myPlanet = Planet.EARTH; // don't use new Planet, instead use Planet.<name of constant>

        canILiveHere(myPlanet);

    }

    static void canILiveHere(Planet myPlanet) {

        switch (myPlanet) {
            case EARTH:
                System.out.println("You can live here :)");
                System.out.println("This is planet #" + myPlanet.number);
                break;
            default:
                System.out.println("You cannot live here.....yet.");
                System.out.println("This is planet #" + myPlanet.number);
                break;
        }
    }
}
