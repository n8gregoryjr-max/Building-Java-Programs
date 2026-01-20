package Chapter02.Exercises;

public class Exercise07 {
    public static void main(String[] args) {
        numChain();
    }
    public static void numChain() {
        int height = 5;
        int length;

        for (int i = 1; i <= height; i++) {
            length = height - i;
            for (int j = 1; j <= length; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}
/*
Write nested for loops to produce the following output:

    1
   2
  3
 4
5
 */