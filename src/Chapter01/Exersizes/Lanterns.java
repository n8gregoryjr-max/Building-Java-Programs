package Chapter01.Exersizes;

public class Lanterns {
    public static void main(String[] args) {
        top();
        middle();
        bottom();
    }
    public static void shortLine() {
        System.out.println("    *****");
    }
    public static void longLine() {
        System.out.println("*************");
    }
    public static void window() {
        System.out.println("* | | | | | *");
    }
    public static void cone() {
        shortLine();
        System.out.println("  *********");
        longLine();
    }
    public static void top() {
        cone();
        System.out.println();
    }
    public static void middle() {
        cone();
        window();
        longLine();
        cone();
        System.out.println();
    }
    public static void bottom() {
        cone();
        shortLine();
        window();
        window();
        shortLine();
        shortLine();
    }
}

//Personally I feel like I could have done this better, but I don't know how to yet... 1/16/26

/*
Write a Java program called Lanterns that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

    *****
  *********
*************

    *****
  *********
*************
* | | | | | *
*************
    *****
  *********
*************

    *****
  *********
*************
    *****
* | | | | | *
* | | | | | *
    *****
    *****
 */