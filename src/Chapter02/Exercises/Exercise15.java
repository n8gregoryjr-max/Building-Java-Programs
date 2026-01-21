package Chapter02.Exercises;

public class Exercise15 {
    public static void main(String[] args) {
        final int height = 5;

        for (int i = 1; i <= height; i++) {

            int dash = (6 - i);
            int num = (2 * i - 1);

            for (int j = 1; j <= dash; j++) {
                System.out.print("-");
            }
            for (int k = 1; k <= num; k++) {
                System.out.print(num);
            }
            for (int l = 1; l <= dash; l++) {
                System.out.print("-");
            }
            System.out.println();}
    }
}
/*
Write a method called printDesign that produces the following output. Use nested for loops to capture the structure of the figure.

-----1-----
----333----
---55555---
--7777777--
-999999999-
 */