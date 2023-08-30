import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class fileWriter {

    public static void main(String[] args) throws FileNotFoundException {
        writeFile("newFile.txt");
    }

    public static void writeFile(String file) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(file);
        pw.print("This is what I'm printing to the file. Not sure what else to write");
        pw.close();
    }

    public int countCharacters(String fileName) throws IOException {
        int count = 0;
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        while (br.ready()) {
            count++;
        }
        br.close();
        return count;
    }

}
