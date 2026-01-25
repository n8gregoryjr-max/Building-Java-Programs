package Chapter01.Exercises;

public class TwoRockets {
    public static void main(String[] args) {
        cone();
        box();
        unitedStates();
        box();
        cone();
    }
    public static void cone() {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }
    public static void box() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }
    public static void unitedStates() {
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }
}
/*
Write a Java program called TwoRockets that generates the following output.
Use static methods to show structure and eliminate redundancy in your solution.
Note that there are two rocket ships next to each other.
What redundancy can you eliminate using static methods? What redundancy cannot be eliminated?

   /\       /\
  /  \     /  \
 /    \   /    \
+------+ +------+
|      | |      |
|      | |      |
+------+ +------+
|United| |United|
|States| |States|
+------+ +------+
|      | |      |
|      | |      |
+------+ +------+
   /\       /\
  /  \     /  \
 /    \   /    \
 */