package Chapter02.Exercises;

public class Exercise08 {
    public static void main(String[] args) {
        numChain2();
    }
    public static void numChain2() {
        int height = 5;
        int length;

        for (int i = 1; i <= height; i++) {
            length = height - i;
            for (int j = 1; j <= length; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
/*
Write nested for loops to produce the following output:

    1
   22
  333
 4444
55555
 */