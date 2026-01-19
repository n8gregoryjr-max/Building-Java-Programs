package Chapter01.Projects;

public class BoughtMeACat {
    public static void main(String[] args) {
        verse1();
        verse2();
        verse3();
        verse4();
        verse5();
        verse6();
        verse7();
        verse8();
        verse9();
    }

//Separator for the Verses of the song. They have unique lines.

    public static void verse1() {
        System.out.println("Bought me a cat and the cat pleased me\n" +
                "I fed my cat under yonder tree");
        loop1();
    }
    public static void verse2() {
        System.out.println("Bought me a hen and the hen pleased me\n" +
                "I fed my hen under yonder tree");
        loop2();
    }
    public static void verse3() {
        System.out.println("Bought me a duck and the duck pleased me\n" +
                "I fed my duck under yonder tree");
        loop3();
    }
    public static void verse4() {
        System.out.println("Bought me a goose and the goose pleased me\n" +
                "I fed my goose under yonder tree");
        loop4();
    }
    public static void verse5() {
        System.out.println("Bought me a sheep and the sheep pleased me\n" +
                "I fed my sheep under yonder tree");
        loop5();
    }
    public static void verse6() {
        System.out.println("Bought me a pig and the pig pleased me\n" +
                "I fed my pig under yonder tree");
        loop6();
    }
    public static void verse7() {
        System.out.println("Bought me a cow and the cow pleased me\n" +
                "I fed my cow under yonder tree");
        loop7();
    }
    public static void verse8() {
        System.out.println("Bought me a horse and the horse pleased me\n" +
                "I fed my horse under yonder tree");
        loop8();
    }
    public static void verse9() {
        System.out.println("Bought me a dog and the dog pleased me\n" +
                "I fed my dog under yonder tree");
        loop9();
    }

//Divider for all the loops that loop into loops. Looping loops. Loopy looping loops. lol

    public static void loop1() {
        System.out.println("Cat goes fiddle-i-fee\n");
    }
    public static void loop2() {
        System.out.println("Hen goes chimmy-chuck, chimmy-chuck");
        loop1();
    }
    public static void loop3() {
        System.out.println("Duck goes quack, quack");
        loop2();
    }
    public static void loop4() {
        System.out.println("Goose goes hissy, hissy");
        loop3();
    }
    public static void loop5() {
        System.out.println("Sheep goes baa, baa");
        loop4();
    }
    public static void loop6() {
        System.out.println("Pig goes oink, oink");
        loop5();
    }
    public static void loop7() {
        System.out.println("Cow goes moo, moo");
        loop6();
    }
    public static void loop8() {
        System.out.println("Horse goes neigh, neigh");
        loop7();
    }
    public static void loop9() {
        System.out.println("Dog goes bow-wow, bow-wow");
        loop8();
    }
}
/*
Write a program that produces as output the words of the song, “Bought Me a Cat.”
Use methods for each verse and for repeated text.

Lyrics:
Bought me a cat and the cat pleased me
I fed my cat under yonder tree
Cat goes fiddle-i-fee

Bought me a hen and the hen pleased me
I fed my hen under yonder tree
Hen goes chimmy-chuck, chimmy-chuck
Cat goes fiddle-i-fee

Bought me a duck and the duck pleased me
I fed my duck under yonder tree
Duck goes quack, quack
Hen goes chimmy-chuck, chimmy-chuck
Cat goes fiddle-i-fee

Bought me a goose and the goose pleased me
I fed my goose under yonder tree
Goose goes hissy, hissy
Duck goes quack, quack
Hen goes chimmy-chuck, chimmy-chuck
Cat goes fiddle-i-fee

Bought me a sheep and the sheep pleased me
I fed my sheep under yonder tree
Sheep goes baa, baa
Goose goes hissy, hissy
Duck goes quack, quack
Hen goes chimmy-chuck, chimmy-chuck
Cat goes fiddle-i-fee

Bought me a pig and the pig pleased me
I fed my pig under yonder tree
Pig goes oink, oink
Sheep goes baa, baa
Goose goes hissy, hissy
Duck goes quack, quack
Hen goes chimmy-chuck, chimmy-chuck
Cat goes fiddle-i-fee

Bought me a cow and the cow pleased me
I fed my cow under yonder tree
Cow goes moo, moo
Pig goes oink, oink
Sheep goes baa, baa
Goose goes hissy, hissy
Duck goes quack, quack
Hen goes chimmy-chuck, chimmy-chuck
Cat goes fiddle-i-fee

Bought me a horse and the horse pleased me
I fed my horse under yonder tree
Horse goes neigh, neigh
Cow goes moo, moo
Pig goes oink, oink
Sheep goes baa, baa
Goose goes hissy, hissy
Duck goes quack, quack
Hen goes chimmy-chuck, chimmy-chuck
Cat goes fiddle-i-fee

Bought me a dog and the dog pleased me
I fed my dog under yonder tree
Dog goes bow-wow, bow-wow
Horse goes neigh, neigh
Cow goes moo, moo
Pig goes oink, oink
Sheep goes baa, baa
Goose goes hissy, hissy
Duck goes quack, quack
Hen goes chimmy-chuck, chimmy-chuck
Cat goes fiddle-i-fee
 */