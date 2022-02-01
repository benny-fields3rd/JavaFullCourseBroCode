public class InnerClasses { // goes with Outside.java

    public static void main(String[] args) {

         /* inner class =   A class inside of another class.
                            useful if a class should be limited in scope.
                            usually private, but not necessary
                            helps group classes that belong together
                            extremely useful for listeners for specific events
                            precursor for anonymous inner classes
        */
        // Create Outside instance;
        Outside out = new Outside();
        // Create Inside instance but accessing it using Outside.Inside (both classes)
        Outside.Inside in = out.new Inside();
        // calling Greeting method from Inside class
        in.Greeting();

    }
}
