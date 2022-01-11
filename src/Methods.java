public class Methods {

    public static void main(String[] args) {

        // method = block of code that is executed whenever it is called upon
        //          anything inside a curly brace usually
        String name = "Benny";
        int age = 21;
        hello(name, age); // calling the hello method with an argument

        // example of return types
        int x = 3;
        int y = 4;

        int z = add(x,y); // local variable inside the immediate set of the main method
        System.out.println(z);
    }

    // example of a method for displaying hello with name
    static void hello(String title, int age) { // normally don't need to add static, but because we are calling the hello method from the static method of main
        System.out.println("Hello " + title);
        System.out.println("You are " + age);
    }

    // example of a method for adding x and y
    static int add(int x, int y) {
        int z = x + y; // local variable inside the add method
        return z;
    }



}
