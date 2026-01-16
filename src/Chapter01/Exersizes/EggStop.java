package Chapter01.Exersizes;

public class EggStop {
    public static void main(String[] args) {
        eggTop();
        eggBottom();
        eggBottom();
        dividerShort();
        eggTop();
        stop();
        eggBottom();
        eggTop();
        dividerLong();
    }
    public static void eggTop() {
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }
    public static void eggBottom() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
    public static void dividerShort() {
        System.out.println("+-------+");
    }
    public static void dividerLong() {
        System.out.println("+---------+");
    }
    public static void stop() {
        System.out.println("|   STOP  |");
    }
}
/*
Write a Java program called EggStop that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

  _______
 /       \
/         \
\         /
 \_______/
\         /
 \_______/
+-------+
  _______
 /       \
/         \
|   STOP  |
\         /
 \_______/
  _______
 /       \
/         \
+---------+
 */