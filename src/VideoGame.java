public class VideoGame { // uses Encapsulation.java

    private String title;
    private String genre;
    private int yearReleased;

    VideoGame(String title, String genre, int yearReleased) {
        // original way if not using setter method
        //this.title = title;
        //this.genre = genre;
        //this.yearReleased = yearReleased;
        // using setter method
        this.setTitle(title);
        this.setGenre(genre);
        this.setYearReleased(yearReleased);
    }

    // create copy constructor
    VideoGame(VideoGame x) {
        this.copy(x);
    }

    // create getter methods for each attribute
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public int getYearReleased() {
        return yearReleased;
    }

    // create setter methods to call method to change values of variables
    public void setTitle(String title) {
        this.title = title;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    // create copy method
    public void copy (VideoGame x) {
        this.setTitle(x.getTitle());
        this.setGenre(x.getGenre());
        this.setYearReleased(x.getYearReleased());
    }
}
