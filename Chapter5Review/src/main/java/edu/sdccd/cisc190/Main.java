package edu.sdccd.cisc190;

public class Main {
    public static void main(String[] args) {
        User.Types.values();
        User user = new User("Bob Smith", 50);



        int num;
        String str = "555";
        num = Integer.parseInt(str) + 5;

        displayValue(num);

        short a = 5;
        byte b = 0;

        displayValues(a, b);

        try {
            showProduct("5", "40");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
//        showProduct(10.0, 4.6);
//        showProduct(10, 4.5);
        showProduct(3.5, 55);

        int x = 7;
        displayValue2(x);

        System.out.println(x);


    }

    public static void displayValue2(int value) {

    }

    public static void showProduct(String num1, String num2) throws Exception {
        try {
            showProduct(Double.parseDouble(num1), Integer.parseInt(num2));
        } catch (NumberFormatException e) {
            throw new Exception(e.getMessage());
        }
    }
    public static void showProduct(double num1, int num2) {
        double product;
        product = num1 * num2;
        System.out.println("The product is " + product);
    }

    public static double methodA() {
        double a = 8.5 + 9.5;
        return a;
    }

    public static double methodB() {
        double a = 8.5 + 9.5;
        return a;
    }

    public static void displayValue(int x) {
        System.out.println(x);
    }

    public static void displayValues(double x, int y) {
        System.out.println(x);
        System.out.println(y);
    }

    /**
     * This method returns a String Hello World plus the input int
     * @param input integer to append to HelloWorld
     * @return String HelloWorld plus the input integer concatenated
     */
    public static String getHelloWorld(int input) {
        return "Hello World! " + input;
    }


}
