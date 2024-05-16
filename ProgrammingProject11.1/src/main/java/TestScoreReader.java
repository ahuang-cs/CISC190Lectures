import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestScoreReader {
    public static void main(String[] args) {
        try {
            FileInputStream outStream = new FileInputStream("TestScores.dat");
            ObjectInputStream objectInputFile = new ObjectInputStream(outStream);
            for(int i=0; i<5; i++) {
                TestScores ts = (TestScores) objectInputFile.readObject();
                System.out.println(ts.getAverageTestScore());
            }

            objectInputFile.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
