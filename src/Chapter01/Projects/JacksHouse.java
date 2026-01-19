package Chapter01.Projects;

public class JacksHouse {
    public static void main(String[] args) {
        verse1();
        verse2();
        verse3();
        verse4();
        verse5();
        verse6();
        verse7();
    }

    //Each verse has a unique starting line for each time.

    public static void verse1() {
        System.out.println("This is the house that Jack built.");
        System.out.println();
    }
    public static void verse2() {
        System.out.println("This is the malt");
        loop1();
    }
    public static void verse3() {
        System.out.println("This is the rat,");
        loop2();
    }
    public static void verse4() {
        System.out.println("This is the cat,");
        loop3();
    }
    public static void verse5() {
        System.out.println("This is the dog,");
        loop4();
    }
    public static void verse6() {
        System.out.println("This is the cow with the crumpled horn,");
        loop5();
    }
    public static void verse7() {
        System.out.println("This is the maiden all forlorn");
        loop6();
    }

    //Adding some loops to make things easier.

    public static void loop1() {
        System.out.println("That lay in the house that Jack built.");
        System.out.println();
    }
    public static void loop2() {
        System.out.println("That ate the malt");
        loop1();
    }
    public static void loop3() {
        System.out.println("That killed the rat,");
        loop2();
    }
    public static void loop4() {
        System.out.println("That worried the cat,");
        loop3();
    }
    public static void loop5() {
        System.out.println("That tossed the dog,");
        loop4();
    }
    public static void loop6() {
        System.out.println("That milked the cow with the crumpled horn,");
        loop5();
    }
}
/*
Write a program that produces as output the words of “The House That Jack Built.”
Use methods for each verse and for repeated text. Here are lyrics to use:

This is the house that Jack built.

This is the malt
That lay in the house that Jack built.

This is the rat,
That ate the malt
That lay in the house that Jack built.

This is the cat,
That killed the rat,
That ate the malt
That lay in the house that Jack built.

This is the dog,
That worried the cat,
That killed the rat,
That ate the malt
That lay in the house that Jack built.

This is the cow with the crumpled horn,
That tossed the dog,
That worried the cat,
That killed the rat,
That ate the malt
That lay in the house that Jack built.

This is the maiden all forlorn
That milked the cow with the crumpled horn,
That tossed the dog,
That worried the cat,
That killed the rat,
That ate the malt
That lay in the house that Jack built.
 */