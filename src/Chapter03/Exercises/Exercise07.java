package Chapter03.Exercises;

public class Exercise07 {
    public static void main(String[] args) {
        largestAbsVal(7, -2, -11);
    }

    public static void largestAbsVal(int one, int two, int three){
        one = Math.abs(one);
        two = Math.abs(two);
        three = Math.abs(three);
        int answer = Math.max(Math.max(one, two), three);
        System.out.print(answer);
    }
}
/*
Write a variation of the largestAbsVal method from the last exercise that takes three integers as parameters and returns the largest of their three absolute values.
For example, a call of largestAbsVal(7, –2, –11) would return 11, and a call of largestAbsVal(-4, 5, 2) would return 5.
 */