import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestScoreWriter {
    public static void main(String[] args) {
        try {
            FileOutputStream outStream = new FileOutputStream("TestScores.dat");
            ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);
            TestScores ts1 = new TestScores(new float[]{50, 60, 70, 90});
            objectOutputFile.writeObject(ts1);
            TestScores ts2 = new TestScores(new float[]{55, 66, 77, 99});
            objectOutputFile.writeObject(ts2);
            TestScores ts3 = new TestScores(new float[]{5, 6, 7, 9});
            objectOutputFile.writeObject(ts3);
            TestScores ts4 = new TestScores(new float[]{0, 90});
            objectOutputFile.writeObject(ts4);
            TestScores ts5 = new TestScores(new float[]{50, 90});
            objectOutputFile.writeObject(ts5);
            objectOutputFile.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
