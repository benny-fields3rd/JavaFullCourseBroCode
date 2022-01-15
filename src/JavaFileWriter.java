import java.io.FileWriter;
import java.io.IOException;

public class JavaFileWriter {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poem.txt"); // creates new file in project
            writer.write("Roses are red. \nViolets are blue \nBooty booty booty booty\nRockin' everywhere!");
            writer.append("\n(A poem by Bro)");
            writer.close(); // important to close writer!
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
