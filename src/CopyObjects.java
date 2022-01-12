public class CopyObjects {

    public static void main(String[] args) {

        VideoGame game1 = new VideoGame("Control","Action", 2018);
        //VideoGame game2 = new VideoGame("Keyna", "Adventure", 2022);

        // We would like to copy the values from game1 over to game2
        // do not do this!
        // game2 = game1; // this make sit the same exact address - this does not copy
        // instead create a copy method in the game class to assign values from game 1 to game 2

        //game2.copy(game1);

        // What if we want to copy the values from one game to another but this time we do it when we instantiate the game instead of afterwards
        // Comment out game2.copy(game1) and VideoGame game2 = new VideoGame("Keyna", "Adventure", 2022)
        // create a constructor in the VideoGame class
        VideoGame game2 = new VideoGame(game1);

        System.out.println(game1); // returns VideoGame@5acf9800
        System.out.println(game2); // returns VideoGame@4617c264
        System.out.println();
        System.out.println(game1.getTitle()); // returns Control
        System.out.println(game1.getGenre()); // returns Action
        System.out.println(game1.getYearReleased()); // returns 2018
        System.out.println();
        // When using the copy() method the below repeats Control due to copying the values of game1 to game 2
        System.out.println(game2.getTitle()); // returns Keyna
        System.out.println(game2.getGenre()); // returns Adventure
        System.out.println(game2.getYearReleased()); // returns 2022


    }

}
