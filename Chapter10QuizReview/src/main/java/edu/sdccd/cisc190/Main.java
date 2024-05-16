package edu.sdccd.cisc190;

public class Main {
    public static void main(String[] args) {
        ClassA item1 = new ClassC();
        item1.method1(5);

        int factor = 10;
        int x = 10;



        ClassC square = new ClassC() {
            public int calculate(int number) {
                return number * number;
            }
        };
    }
}
    // subclass     superclass          interfaces csv
class ClassY extends ClassB implements MyInterface, Interface1{}

interface Interface1 {
    int FIELDA = 55;
    int methodA(double a);
    default int methodB(int a) {
        return a;
    }
}


interface MyInterface {
    final static int FIELDA = 55;
    public int methodA(double d);
}

class ClassZ implements MyInterface {
    int FIELDA = 60;
    public int methodA(double d){return 0;}
}


 abstract class ClassA {
    public ClassA(int a){
        System.out.println("ClassA constructor");
    }
     public int method1(int a) {
        System.out.println("ClassA.method1");
        return a;
     }
     // method1 overloaded with input parameter difference
     public int method1(char b) {
         System.out.println("ClassA.method2");
         return b;
     }
     abstract int method3(int c);
 }
 class ClassB extends ClassA implements Interface1 {
    public ClassB() {
        super(10);
    }

    // Overriden
     @Override
     public int method1(int hello) {
        System.out.println("ClassB.method1");
        return hello;
     }

     // overloading
     public int method1(String s) {
        return 0;
     }

     @Override
     int method3(int c) {
         return 0;
     }

     public int method2(double c) {
        return 0;
     }

     @Override
     public int methodA(double a) {
         return 0;
     }
 }
 class ClassC extends ClassB {
    public ClassC() {
        System.out.println("ClassC constructor");
    }
     public void method1() {
        System.out.println("ClassC.method1");
     }
 }
