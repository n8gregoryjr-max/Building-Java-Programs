package Chapter01.Exercises;

public class Egg2 {
    public static void main(String[] args) {
        eggWhole();
        eggWhole();
        eggBottom();
        eggTop();
        dividerLine();
        eggBottom();
    }
    public static void eggTop() {
        System.out.println("""
                  _______
                 /       \\
                /         \\""");
    }
    public static void eggBottom() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
    public static void eggWhole() {
        eggTop();
        eggBottom();
        dividerLine();
    }
    public static void dividerLine() {
        System.out.println("-\"-'-\"-'-\"-");
    }
}
/*
Modify the program from the previous exercise to become a new program Egg2 that displays the following output. Use static methods as appropriate.

  _______
 /       \
/         \
\         /
 \_______/
-"-'-"-'-"-
  _______
 /       \
/         \
\         /
 \_______/
-"-'-"-'-"-
\         /
 \_______/
  _______
 /       \
/         \
-"-'-"-'-"-
\         /
 \_______/
 */