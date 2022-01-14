public class Interface { // uses Rabbit, Hawk, Fish classes and Prey, Predator Interfaces

    public static void main(String[] args) {

        // interface = a template that can be applied to a class.
        //             similar to inheritance, but spcifies what a class has/must do.
        //             classes can apply more than one interface, inheritance is limited to 1 super class

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.hunt();
        fish.flee();


    }

}
