import java.io.*;

public class DataDisplay {
    public static void seekReadAndPrint(RandomAccessFile inputFile, long position) throws IOException {
        inputFile.seek(position);
        System.out.println(inputFile.readByte());
    }
    public static void main(String[] args) {
        try {
            RandomAccessFile inputFile = new RandomAccessFile("data.dat", "r");
            //    Displays the first 5 bytes stored in the file. Each byte should be displayed on a separate line.
            for(long byteNum = 0; byteNum < 5; byteNum++) {
                seekReadAndPrint(inputFile, byteNum);
            }
            //    Starting with byte 0, displays every even-numbered byte in the file. (In other words, display byte 0, byte 2, byte 4, and so on.) Each byte should be displayed on a separate line.
            for(long byteNum = 0; byteNum < inputFile.length(); byteNum+=2) {
                seekReadAndPrint(inputFile, byteNum);
            }
            //    Starting with byte 1, displays every odd-numbered byte in the file. (In other words, display byte 1, byte 3, byte 5, and so on.) Each byte should be displayed on a separate line.
            for(long byteNum = 1; byteNum < inputFile.length(); byteNum+=2) {
                seekReadAndPrint(inputFile, byteNum);
            }

            //    Displays the last 5 bytes stored in the file, in reverse order. (Display the last byte, then the next-to-last byte, and so on.) Each byte should be displayed on a separate line.
            long lastByte = inputFile.length() - 1;
            for(long byteNum = lastByte; byteNum >= 0 && byteNum > lastByte - 5; byteNum--) {
                seekReadAndPrint(inputFile, byteNum);
            }

        } catch(FileNotFoundException e) {
            System.out.println("File Error");
        } catch (EOFException e) {
            System.out.println("EOF Error");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
