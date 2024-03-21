import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int speed = -1;
        int time = 0;

        //Do not accept a negative number for speed
        while(speed < 0) {
            System.out.print("Enter vehicle speed (in mph): ");
            speed = kb.nextInt();
        }

        //do not accept any value less than 1 for traveling time.
        while (time < 1) {
            System.out.print("Enter traveling time (in hours): ");
            time = kb.nextInt();
        }
        for(int hour=1; hour <= time; hour++) {
            System.out.printf("After %d hour(s) the distance is %d miles.\n", hour, hour * speed);
        }
    }
}
