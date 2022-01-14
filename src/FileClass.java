import java.io.File;

public class FileClass {

    public static void main(String[] args) {

        // file = An abstract representation of file and directory pathnames

        // create a file object
        File file = new File("secret_message.txt"); // remember I placed the file in the project folder - so use file name
                                                                                // if file is not in project, then you have to use the path


        // to check/detect to see if a file exist or not
        if (file.exists()) {
            System.out.println(file.getPath());
            System.out.println("That file exists! :0!");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile()); // boolean to return true if a file and not a folder
            file.delete(); // deletes the file - make sure to refresh
        }
        else {
            System.out.println("That file does not exist. :(");
        }


    }


}
