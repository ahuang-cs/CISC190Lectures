import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double distance;
        int menuOption;
        Scanner kb = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a distance in meters: ");
            distance = kb.nextDouble();
            if (distance < 0) {
                System.out.println("Invalid distance. Try again.");
                continue;
            }
            menu();
            menuOption = kb.nextInt();
            switch(menuOption) {
                case 1:
                    showKilometers(distance);
                    break;
                case 2:
                    showInches(distance);
                    break;
                case 3:
                    showFeet(distance);
                    break;
                case 4:
                    System.out.println("Bye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid selection. Try again.");
            }
        }
    }

    public static void menu() {
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
    }
    public static void showKilometers(double meters) {
        System.out.printf("%f meters is %f kilometers\n", meters, meters/1000);
    }
    private static void showInches(double meters) {
        System.out.printf("%f meters is %f inches\n", meters, meters * 39.37);
    }
    private static void showFeet(double meters) {
        System.out.printf("%f meters is %f feet\n", meters, meters * 3.281);
    }
}
