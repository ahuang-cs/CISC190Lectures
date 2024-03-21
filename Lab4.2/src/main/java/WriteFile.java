import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteFile {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("numbers.txt");
            for(int i = 1; i <= 49; i++) {
                pw.println(i);
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}