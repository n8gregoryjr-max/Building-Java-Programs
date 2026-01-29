package Chapter03.Exercises;

public class Exercise13 {
    public static void main(String[] args) {
        pay(4, 11);
    }

    public static void pay(double rate, int time) {
            // Initialize a final value.
        double money = 0;
            // Base pay for hours worked.
        for (int i = 0; i < time; i++) {
            money += rate;
        }
            // Adds overtime pay past 8 hours worked.
        for (int i = 0; i < time - 8; i++) {
            money += (rate / 2);
        }
        System.out.print(money);
    }
}
/*
Write a method called pay that accepts two parameters: a real number for a TA’s salary, and an integer for the number of hours the TA worked this week.
The method should return how much money to pay the TA. For example, the call pay(5.50, 6) should return 33.0.
The TA should receive “overtime” pay of 1 1/2 times the normal salary for any hours above 8.
For example, the call 'pay(4.00, 11)' should return (4.00 * 8) + (6.00 * 3) or 50.0.
 */