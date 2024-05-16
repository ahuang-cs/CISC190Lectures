import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class ReverseFile {
    public static void main(String[] args) {
        try {
            RandomAccessFile input = new RandomAccessFile("data.dat", "r");
            RandomAccessFile output = new RandomAccessFile("reverse.dat", "rw");
            long lastByte = input.length() - 1;
            for(long byteNum = lastByte; byteNum >= 0; byteNum--) {
                input.seek(byteNum);
                output.writeByte(input.readByte());
            }
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Error");
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
