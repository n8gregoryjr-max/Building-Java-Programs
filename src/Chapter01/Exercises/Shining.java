package Chapter01.Exercises;

public class Shining {
    public static void main(String[] args) {
        print500();
        print500();
    }
    public static void print1() {
        System.out.println("All work and no play makes Jack a dull boy.");
    }
    public static void print5() {
        print1();
        print1();
        print1();
        print1();
        print1();
    }
    public static void print25() {
        print5();
        print5();
        print5();
        print5();
        print5();
    }
    public static void print125() {
        print25();
        print25();
        print25();
        print25();
        print25();
    }
    public static void print500() {
        print125();
        print125();
        print125();
        print125();
    }
}
/*
Write a program called Shining that prints the following line of output 1000 times:

All work and no play makes Jack a dull boy.

You should not write a program that uses 1000 lines of source code; use methods to shorten the program.
What is the shortest program you can write that will produce the 1000 lines of output, using only the material from this chapter?
 */