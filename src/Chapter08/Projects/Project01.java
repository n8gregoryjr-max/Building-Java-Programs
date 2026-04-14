package Chapter08.Projects;

public class Project01 {

}
/*
Write a class called 'RationalNumber' that represents a fraction with an integer numerator and denominator.
A RationalNumber object should have the following methods:

    public RationalNumber(int numerator, int denominator)

Constructs a new rational number to represent the ratio (numerator/denominator).
The denominator cannot be 0, so throw an IllegalArgumentException if 0 is passed.

    public RationalNumber()

Constructs a new rational number to represent the ratio (0/1).

    public int getDenominator()

Returns this rational number’s denominator value; for example, if the ratio is (3/5), returns 5.

    public int getNumerator()

Returns this rational number’s numerator value; for example, if the ratio is (3/5), returns 3.

    public String toString()

Returns a String representation of this rational number, such as "3/5".
You may want to omit denominators of 1, returning "4" instead of "4/1".

An extra challenge would be to maintain your RationalNumber objects in reduced form,
avoiding rational numbers such as 3/6 in favor of 1/2, or avoiding 2/–3 in favor of –2/3.
Another possible extra feature would be methods to add, subtract, multiply, and divide two rational numbers.
 */