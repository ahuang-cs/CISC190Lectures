package edu.sdccd.cisc190;

import edu.sdccd.cisc190.vehicle.Chargeable;
import edu.sdccd.cisc190.vehicle.HybridCar;
import edu.sdccd.cisc190.vehicle.Option;
import edu.sdccd.cisc190.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        IntCalculator square = new IntCalculator() {
            @Override
            public int calculate(int x) {
                return x * x;
            }
        };
        System.out.println(square.calculate(100));

        IntCalculator squareLambda = x -> x * x;
        System.out.println(squareLambda.calculate(100));

        Vehicle prius = new HybridCar("Toyota Prius", 100, 38000, 5, null, 4);
        ((HybridCar) prius).buildEngine();

        List<GradedActivity> grades = new ArrayList<>();

        grades.add(new CurvedActivity(0.5));
        grades.add(new FinalExam(10, 0));

        for(GradedActivity activity: grades.stream().filter(grade -> grade.getGrade()=='C').collect(Collectors.toList())) {
            System.out.println(activity.getGrade());
        }

        GradedActivity ga = new GradedActivity();
        // ((CurvedActivity) ga).getRawScore();  // throws runtime ClassCastException since casting from parent to child class is not allowed

        for(GradedActivity grade : grades) {
            System.out.println(grade.getClass().getSimpleName() + " " + grade.getGrade());
        }
    }
}
