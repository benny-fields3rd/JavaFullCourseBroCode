public class StaticKeyword { // uses Friend.java

    public static void main(String[] args) {

        // static = modifier. A single copy of a variable/method is created and shared.
        //			The class "owns" the static member
        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        // since there is only one copy, all the instances of the Friend class are forced to share the static member (numberOfFriends)
        //System.out.println(Friend.numberOfFriends); // displays number of friends in numbers

        Friend.displayFriends(); // returns You have 4 friends.

    }
}
