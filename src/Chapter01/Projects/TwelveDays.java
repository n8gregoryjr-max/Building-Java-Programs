package Chapter01.Projects;

public class TwelveDays {
    public static void main() {
        dayOne();
        dayTwo();
        dayThree();
        dayFour();
        dayFive();
        daySix();
        daySeven();
        dayEight();
        dayNice();
        dayTen();
        dayTenOne();
        dayOneTwo();
    }
    //Below are the Days.
    public static void dayOne() {
        System.out.print("On the first");
        intro();
        gift1();
    }
    public static void dayTwo() {
        System.out.print("On the second");
        intro();
        gift2();
    }
    public static void dayThree() {
        System.out.print("On the third");
        intro();
        gift3();
    }
    public static void dayFour() {
        System.out.print("On the fourth");
        intro();
        gift4();
    }
    public static void dayFive() {
        System.out.print("On the fifth");
        intro();
        gift5();
    }
    public static void daySix() {
        System.out.print("On the sixth");
        intro();
        gift6();
    }
    public static void daySeven() {
        System.out.print("On the seventh");
        intro();
        gift7();
    }
    public static void dayEight() {
        System.out.print("On the eighth");
        intro();
        gift8();
    }
    public static void dayNice() {
        System.out.print("On the ninth");
        intro();
        gift9();
    }
    public static void dayTen() {
        System.out.print("On the tenth");
        intro();
        gift10();
    }
    public static void dayTenOne() {
        System.out.print("On the eleventh");
        intro();
        gift11();
    }
    public static void dayOneTwo() {
        System.out.print("On the twelfth");
        intro();
        gift12();
    }
    //Below are the parts that make the rest easier
    //Also, I wanted to add a 'print' into a 'println' to mess around
    public static void intro() {
        System.out.println(" day of Christmas,");
        System.out.println("my true love sent to me");
    }
    public static void gift1(){
        System.out.println("a partridge in a pear tree.");
        System.out.println();
    }
    public static void gift2(){
        System.out.println("two turtle doves, and");
        gift1();
    }
    public static void gift3(){
        System.out.println("three French hens,");
        gift2();
    }
    public static void gift4(){
        System.out.println("four calling birds,");
        gift3();
    }
    public static void gift5(){
        System.out.println("five golden rings,");
        gift4();
    }
    public static void gift6(){
        System.out.println("six geese a-laying,");
        gift5();
    }
    public static void gift7(){
        System.out.println("seven swans a-swimming,");
        gift6();
    }
    public static void gift8(){
        System.out.println("eight maids a-milking,");
        gift7();
    }
    public static void gift9(){
        System.out.println("nine ladies dancing,");
        gift8();
    }
    public static void gift10(){
        System.out.println("ten lords a-leaping,");
        gift9();
    }
    public static void gift11(){
        System.out.println("eleven pipers piping,");
        gift10();
    }
    public static void gift12(){
        System.out.println("twelve drummers drumming,");
        gift11();
    }
}
/*
Write a program that produces as output the words of “The Twelve Days of Christmas.” (Static methods simplify this task.)
 */