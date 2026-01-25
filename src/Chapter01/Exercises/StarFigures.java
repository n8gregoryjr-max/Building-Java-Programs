package Chapter01.Exercises;

public class StarFigures {
    public static void main(String[] args) {
        crossAndLines();
        System.out.println();
        crossAndLines();
        twoLines();
        System.out.println();
        line();
        crossAndLines();
    }
    public static void twoLines() {
        System.out.println("*****");
        System.out.println("*****");
    }
    public static void crossAndLines() {
        twoLines();
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }
    public static void line() {
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
    }
}
/*
Write a Java program called StarFigures that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

*****
*****
 * *
  *
 * *

*****
*****
 * *
  *
 * *
*****
*****

  *
  *
  *
*****
*****
 * *
  *
 * *
 */