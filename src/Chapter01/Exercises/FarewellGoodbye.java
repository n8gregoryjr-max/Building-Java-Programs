package Chapter01.Exercises;

public class FarewellGoodbye {
    public static void main(String[] args) {
        verse1();
        verse2();
        verse3();
    }
    public static void beginning() {
        System.out.println("""
                Farewell,
                goodbye,
                au revoir,""");
    }
    public static void end1() {
        System.out.println("""
                good night!
                It's time, to go,
                and I'll be out of sight!""");
        System.out.println();
    }
    public static void end2() {
        System.out.println("""
                take care!
                I'll say, goodbye,
                that's neither here nor there!""");
        System.out.println();
    }
    public static void end3() {
        System.out.println("""
                see you later!
                I hope, you think,
                I'm a lover, not a hater!""");
    }
    public static void verse1() {
        beginning();
        end1();
    }
    public static void verse2() {
        beginning();
        end2();
    }
    public static void verse3() {
        beginning();
        end3();
    }
}

//I found a fun and interesting way to do include multiple lines of text within on println call.

/*
Write a program called FarewellGoodBye that prints the following lyrics. Use static methods to show structure and eliminate redundancy in your solution.

Farewell,
goodbye,
au revoir,
good night!
It's time, to go,
and I'll be out of sight!

Farewell,
goodbye,
au revoir,
take care!
I'll say, goodbye,
that's neither here nor there!

Farewell,
goodbye,
au revoir,
see you later!
I hope, you think,
I'm a lover, not a hater!
 */