public class ObjectPassing {

    public static void main(String[] args) {

        // create garage object
        Garage garage = new Garage();

        // create automobile objects
        Automobile automobile1 = new Automobile("Tesla");
        Automobile automobile2 = new Automobile("Mercedes");

        // call the garage class
        garage.park(automobile1);
        garage.park(automobile2);

    }

}
