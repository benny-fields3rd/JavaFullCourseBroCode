public class Encapsulation { // uses VideoGame.java

    public static void main(String[] args) {

        // Encapsulation = attributes of a class will be hidden or private,
        //                 can be accessed only through methods (getters & setters)
        //                 You should make attributes private if you don't have a reason to make them public/protected

        VideoGame videoGame = new VideoGame("Halo","FPS", 2021);
        //System.out.println(videoGame.genre); // Won't return because attributes are private - instead use getter methods
                                               // create getter methods on VideoGame class

        // using get methods to return all private variables
        //System.out.println(videoGame.getTitle()); // returns Halo
        //System.out.println(videoGame.getGenre()); // returns FPS
        //System.out.println(videoGame.getYearReleased()); // returns 2021

        // using setter to change year and then getters to get values
        videoGame.setYearReleased(2022);
        System.out.println(videoGame.getTitle()); // returns Halo
        System.out.println(videoGame.getGenre()); // returns FPS
        System.out.println(videoGame.getYearReleased()); // returns 2022
    }

}
