package Chapter01.Projects;

public class SillySong {
    public static void main(String[] args) {
        verse1();
        verse2();
        verse3();
        verse4();
        verse5();
    }

//Verse for the song

    public static void verse1() {
        System.out.println("I once wrote a program that wouldn't compile");
        loop1();
    }
    public static void verse2() {
        System.out.println("My program did nothing\n" +
                "So I started typing.");
        loop2();
    }
    public static void verse3() {
        System.out.println("\"Parse error,\" cried the compiler\n" +
                "Luckily I'm such a code baller.");
        loop3();
    }
    public static void verse4() {
        System.out.println("Now the compiler wanted an identifier\n" +
                "And I thought the situation was getting dire.");
        loop4();
    }
    public static void verse5() {
        System.out.println("Java complained it expected an enum\n" +
                "Boy, these computers really are dumb!");
        loop5();
    }

//Loops to reduce length of code needed

    public static void loop1() {
        System.out.println("I don't know why it wouldn't compile,\n" +
                "My TA just smiled.");
        System.out.println();
    }
    public static void loop2() {
        System.out.println("I added System.out.println(\"I <3 coding\"),");
        loop1();
    }
    public static void loop3() {
        System.out.println("I added a backslash to escape the quotes,");
        loop2();
    }
    public static void loop4() {
        System.out.println("I added a main method with its String[] args,");
        loop3();
    }
    public static void loop5() {
        System.out.println("I added a public class and called it Scum,");
        loop4();
    }
}
/*
Write a program that produces as output the words of the following silly song. Use methods for each verse and for repeated text.
Here are the song’s complete lyrics:

I once wrote a program that wouldn't compile
I don't know why it wouldn't compile,
My TA just smiled.

My program did nothing
So I started typing.
I added System.out.println("I <3 coding"),
I don't know why it wouldn't compile,
My TA just smiled.

"Parse error," cried the compiler
Luckily I'm such a code baller.
I added a backslash to escape the quotes,
I added System.out.println("I <3 coding"),
I don't know why it wouldn't compile,
My TA just smiled.

Now the compiler wanted an identifier
And I thought the situation was getting dire.
I added a main method with its String[] args,
I added a backslash to escape the quotes,
I added System.out.println("I <3 coding"),
I don't know why it wouldn't compile,
My TA just smiled.

Java complained it expected an enum
Boy, these computers really are dumb!
I added a public class and called it Scum,
I added a main method with its String[] args,
I added a backslash to escape the quotes,
I added System.out.println("I <3 coding"),
I don't know why it wouldn't compile,
My TA just smiled.
 */