import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaFileWriterRead {

    public static void main(String[] args) {

        // FileReader = read the contents of a file as a stream of characters.
        //              read() returns an int value which contains the byte value
        //              when read() returns -1, there is no more data to be read

        try {
            FileReader reader = new FileReader("art.txt"); // cre
            int data = reader.read();
            // continue reading file as long as the value returned does not equal -1 using while loop
            while (data != -1) {
                System.out.print((char)data); // use print instead of println otherwise you will get a new line after each individual character
                data = reader.read();
            }
            reader.close(); // close reader
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();;
        }
    }
}
