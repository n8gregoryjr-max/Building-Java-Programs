package Chapter03.Exercises;

public class Exercise09 {
    public static void main(String[] args) {
        lastDigit(-12345);
    }

    public static void lastDigit(int num){
            /* Instead of converting it into a String and getting the last value of the String, I wanted to
                    figure out the math behind it, so I used StackOverflow (Link below) */
        System.out.print(Math.abs(num % 10));
    }
}
// https://stackoverflow.com/questions/17144997/gets-last-digit-of-a-number
/*
Write a method called 'lastDigit' that returns the last digit of an integer. For example, 'lastDigit(3572)' should return 2.
It should work for negative numbers as well. For example, 'lastDigit(-947)' should return 7.
 */