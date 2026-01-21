package Chapter02.Exercises;

public class Exercise12 {
    public static void main(String[] args) {
        final int height = 3, width = 30;
        int x = width / height;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= x; j++) {
                int a = (j - 1) % x;
                for (int k = 1; k <= height; k++) {
                    System.out.print(a);
                }
            }
            System.out.println();
        }
    }
}
/*
Write nested for loops that produce the following output:

000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
 */