import java.io.Serializable;

public class TestScores implements Serializable {
    private float[] testScores;
    public TestScores(float[] testScores) {
        this.testScores = testScores;
    }

    public float getAverageTestScore() {
        float sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            if(testScores[i] < 0 || testScores[i] > 100) throw new IllegalArgumentException();
            sum += testScores[i];
        }
        return sum / testScores.length;
    }

}
