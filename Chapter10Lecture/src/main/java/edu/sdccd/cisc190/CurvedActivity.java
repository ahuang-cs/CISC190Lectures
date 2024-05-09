package edu.sdccd.cisc190;

public class CurvedActivity extends GradedActivity {
    private double rawScore;
    private double percentage;
    public CurvedActivity(double percent) {
        this.percentage = percent;
    }


    // dynamic binding, runtime
    @Override
    public void setScore(double score) {
        super.setScore(rawScore * percentage);
    }

    // static binding, compile time, will ensure input and output data types match
    // overloading setScore with different input parameters
    public void setScore(char letterGrade) {

    }

    public double getRawScore() {
        return rawScore;
    }

    public double getPercentage() {
        return percentage;
    }
}
