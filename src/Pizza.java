public class Pizza {

    // variables outside of constructor
    String bread;
    String sauce;
    String cheese;
    String topping;

    // constructor with 4 parameters
    // below are constructors with same name, BUT different paremeters for overloading!!
    Pizza(String bread, String sauce, String cheese, String topping){

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
    // 3 parameters
    Pizza(String bread, String sauce, String cheese){

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
    // 2 parameters
    Pizza(String bread, String sauce){

        this.bread = bread;
        this.sauce = sauce;
    }
    // 1 parameter
    Pizza(String bread){

        this.bread = bread;
    }
}
