import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileLetterCounter {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = kb.nextLine();
        System.out.print("Enter character to count: ");
        char c = kb.next().charAt(0);

        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            int charCount = 0;
            String line = null;
            while(fileScanner.hasNext()) {
                line = fileScanner.next();
                for(int i = 0; i < line.length(); i++) {
                    if(line.charAt(i) == c) {
                        charCount++;
                    }
                }
            }
            System.out.printf("The character '%c' appears in the file %s %d times.\n", c, fileName, charCount);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }

    }
}
