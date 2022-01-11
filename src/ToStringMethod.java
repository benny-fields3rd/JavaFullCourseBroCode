public class ToStringMethod {

    public static void main(String[] args) {

        // toString() = special method that all objects inherit,
        //    that returns a string that "textually represents" an object.
        //    can be used both implicitly and explicitly

        Car car1 = new Car();

        // below returns a string that "textually represents" an object
        //System.out.println(car1.make);
        //System.out.println(car1.model);
        //System.out.println(car1.color);
        //System.out.println(car1.year);

        // before using toString -  it returns address of car object in memory or address where the object is in memory
        //System.out.println(car1); // returns Car@5acf9800 - to fix this, you can use the toString method (shown in the car.java - Car Class
        // using toString explicitly
        System.out.println(car1.toString());
        // after using toString in the toString in the Car Class, you can also just call car
        // using implicitly
        System.out.println(car1);

    }

}
