public class Outside { // goes with InnerClasses.java

    // declare x globally
    String x = "Hello ";

    // create a new class inside Outside class
    public class Inside {
        // declare y inside Inside
        String y = "World!";

        // create Greeting method to print both variables inside the Inside class
        public void Greeting(){
            System.out.println(x + y);
        }
    }

}
