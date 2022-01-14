public class Polymorphism {

    public static void main(String[] args) {

        // polymorphism = 	greek word for poly-"many", morph-"form"
        //					The ability of an object to identify as more than one type
        // Example: The Air Force identifies as teh air force but also identifies as a type of military

        AirForce airforce = new AirForce();
        Army army = new Army();
        Marines marines = new Marines();
        Navy navy = new Navy();

        Military[] branches = {airforce,army, marines,navy}; // storing different object within an array using polymorphism

        // each of the classes have their own fight method
        // you can call each one as follows
        /*
        airforce.fight();
        army.fight();
        marines.fight();
        navy.fight();
        */
        // But a much better way is to do an enhanced for loop
        for(Military x : branches) {
            x.fight(); // at first this does not recognize fight method, so we must add the fight method in the Military class
        }



    }

}
