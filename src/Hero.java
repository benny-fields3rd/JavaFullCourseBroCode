public class Hero extends Person{

    String power;

    Hero(String name, int age, String power) {
        super(name,age); // sends values to constructor of Person
        this.power = power;
    }

    public String toString() {
        return super.toString() + this.power;
    }

}
