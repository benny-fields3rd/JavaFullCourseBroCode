public class Friend { // uses StaticKeyword.java

    String name;
    // applying static modifier to a variable
    static int numberOfFriends;

    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    // create a static method that returns the amount of friends we have in a message
    static void displayFriends() {
        System.out.println("You have " + numberOfFriends + " friends.");
    }
}
