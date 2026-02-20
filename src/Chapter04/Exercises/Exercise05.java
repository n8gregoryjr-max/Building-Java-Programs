package Chapter04.Exercises;

public class Exercise05 {
   void main(){
       pow(3, 4);
   }

    public static void pow(int a, int b) {
       int A = a;
       if (b > 0) {
           for (int i = 1; i < b; i++) {
                a = a * A;
           }
           IO.print(a);
       } else {
           IO.print("1");
       }
    }
}
/*
Write a method called 'pow' that accepts a base and an exponent as parameters and returns the base raised to the given power.
For example, the call pow(3, 4) should return 3 * 3 * 3 * 3, or 81. Assume that the base and exponent are nonnegative.
 */