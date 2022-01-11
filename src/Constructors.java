public class Constructors {

    public static void main(String[] args) {

        // constructors = special method that is called when an object is instantiated (created)

        Human human1 = new Human("Benny", 45, 260); //Must pass matching parameters from Human class constructor
        Human human2 = new Human("Robyn", 39, 150);

        System.out.println(human2.name);
        human2.eat(); // displays Robyn is eating.
        human1.drink(); // displays Benny is drinking.

    }

}
