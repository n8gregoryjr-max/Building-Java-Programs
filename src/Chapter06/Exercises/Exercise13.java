package Chapter06.Exercises;

public class Exercise13 {
}
//Write a method called 'stripComments' that accepts a Scanner representing an input file containing a Java program
//as its parameter, reads that file, and then prints the file’s text with all comments removed.
//
//        For example, consider the following text:
//
//        import java.util.*;
//
//  /* My program
//  by Suzy Student */
//  public class Program {
//    public static void main(String[] args) {
//        System.out.println("Hello, world!"); // a println
//    }
//    public static /* Hello there */ void foo() {
//        System.out.println("Goodbye!"); // comment here
//    } /* */
//  }
//
// If the file contained this text, your program should output the following text:
//
//    import java.util.*;
//
//  public class Program {
//    public static void main(String[] args) {
//        System.out.println("Hello, world!");
//    }
//    public static  void foo() {
//        System.out.println("Goodbye!");
//    }
//  }