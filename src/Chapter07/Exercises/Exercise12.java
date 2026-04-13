package Chapter07.Exercises;

public class Exercise12 {
}
/*
Write a method called 'priceIsRight' that mimics the guessing rules from the game show The Price Is Right.
The method accepts as parameters an array of integers representing the contestants’ bids and an integer representing a correct price.
The method returns the element in the bids array that is closest in value to the correct price without being larger than that price.
For example, if an array called bids stores the values [200, 300, 250, 1, 950, 40], the call of
priceIsRight(bids, 280) should return 250, since 250 is the bid closest to 280 without going over 280.
If all bids are larger than the correct price, your method should return –1.
 */