import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) throws IOException {
        System.out.println(readText("newFile.txt"));
    }

    public static String readText(String fileName) throws IOException {
        String output = "";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()) {
            int letter = reader.read();
            output += (char) letter;
        }
        reader.close();
        return output;
    }
}