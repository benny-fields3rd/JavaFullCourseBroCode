public class Dog extends Animal {

    // giving the dog class it's own method of speak, overriding Animals speak method
    // Good practice to add the @Override - doesn't do anything thing functionally more of a comment
    @Override
    public void speak() {
        System.out.println("The dog goes bark.");
    }

}
