import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int x = stdin.nextInt();
        while(x > 0) {
            if(x > 100) {
                System.out.printf("%d ", x);
            }
            x = stdin.nextInt();
        }
    }
}
