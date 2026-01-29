package Chapter03.Exercises;

public class Exercise06 {
    public static void main(String[] args) {
        largerAbsVal(11, 2);
    }

    public static void largerAbsVal(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        System.out.print(Math.max(a, b));
    }
}
/*
Write a method called largerAbsVal that takes two integers as parameters and returns the larger of the two absolute values.
A call of largerAbsVal(11, 2) would return 11, and a call of largerAbsVal(4, –5) would return 5.
 */