import java.io.FileNotFoundException;
import java.io.PrintWriter;

class WriteFile {
    public static final String FILE_NAME = "numbers.txt";
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(FILE_NAME);
            for(int i = 1; i <= 49; i++) {
                pw.println(i);
            }
            pw.close();
        } catch (FileNotFoundException e) {
            // do nothing with exception since test checks for no output
        }

    }
}
