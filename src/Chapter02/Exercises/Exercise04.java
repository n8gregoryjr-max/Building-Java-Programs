package Chapter02.Exercises;

public class Exercise04 {
    public static void main(String[] args) {
        block();
    }
    public static void block() {
        int height = 4;
        int length = 5;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
Write nested for loops to produce the following output:

*****
*****
*****
*****
 */