import java.util.Scanner;

class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = -1, time = 0;

        while(speed < 0) {
            System.out.print("Enter vehicle speed (in mph): ");
            try {
                speed = scanner.nextInt();
            } catch (Exception e) {
                // grab the next token and do nothing with it
                scanner.next();
            }
        }

        while(time < 1) {
            System.out.print("Enter traveling time (in hours): ");
            try {
                time = scanner.nextInt();
            } catch (Exception e) {
                // grab the next token and do nothing with it
                scanner.next();
            }
        }

        for(int hour = 1; hour <= time; hour++) {
            System.out.printf("After %d hour(s) the distance is %d miles.\n", hour, (speed * hour));
        }
    }
}
