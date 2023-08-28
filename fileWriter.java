import java.io.FileNotFoundException;
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
}
