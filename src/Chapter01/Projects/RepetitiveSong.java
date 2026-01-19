package Chapter01.Projects;

public class RepetitiveSong {
    public static void main(String[] args) {
        verse1();
        verse2();
        verse3();
        verse4();
        verse5();
        verse6();
        end();
    }

//Each verse has unique lines, so add on the loops to then end to make it efficient.

    public static void verse1() {
        System.out.println("There was an old lady who swallowed a fly");
        loop1();
    }
    public static void verse2() {
        System.out.println("There was an old lady who swallowed a spider,\n" +
                "That wriggled and wiggled and tiggled inside her;");
        loop2();
    }
    public static void verse3() {
        System.out.println("There was an old lady who swallowed a bird;\n" +
                "How absurd to swallow a bird.");
        loop3();
    }
    public static void verse4() {
        System.out.println("There was an old lady who swallowed a bird;\n" +
                "How absurd to swallow a bird.");
        loop4();
    }
    public static void verse5() {
        System.out.println("There was an old lady that swallowed a dog;\n" +
                "What a hog, to swallow a dog;");
        loop5();
    }
    public static void verse6() {
        System.out.println("There was an old lady who swallowed a cow,\n" +
                "I don't know how she swallowed a cow;");
        loop6();
    }
    public static void end() {
        System.out.println("There was an old lady who swallowed a horse...\n" +
                "She's dead, of course!");
    }

//Basic loops to minimize repetition.

    public static void loop1() {
        System.out.println("I don't know why she swallowed a fly - perhaps she'll die!");
        System.out.println();
    }
    public static void loop2() {
        System.out.println("She swallowed the spider to catch the fly;");
        loop1();
    }
    public static void loop3() {
        System.out.println("She swallowed the bird to catch the spider,");
        loop2();
    }
    public static void loop4() {
        System.out.println("She swallowed the cat to catch the bird,");
        loop3();
    }
    public static void loop5() {
        System.out.println("She swallowed the dog to catch the cat,");
        loop4();
    }
    public static void loop6() {
        System.out.println("She swallowed the cow to catch the dog,");
        loop5();
    }
}
/*
Write a program that produces as output the lyrics to the repetitive song, “There Was an Old Lady Who Swallowed a Fly,” by Simms Taback.
Use methods for each verse and the refrain.
Your methods should capture the structure of the song’s verses as well as avoid redundancy between similar lines and groups of lines.

Lyrics:
There was an old lady who swallowed a fly
I don't know why she swallowed a fly - perhaps she'll die!

There was an old lady who swallowed a spider,
That wriggled and wiggled and tiggled inside her;
She swallowed the spider to catch the fly;
I don't know why she swallowed a fly - Perhaps she'll die!

There was an old lady who swallowed a bird;
How absurd to swallow a bird.
She swallowed the bird to catch the spider,
She swallowed the spider to catch the fly;
I don't know why she swallowed a fly - Perhaps she'll die!

There was an old lady who swallowed a cat;
Fancy that to swallow a cat!
She swallowed the cat to catch the bird,
She swallowed the bird to catch the spider,
She swallowed the spider to catch the fly;
I don't know why she swallowed a fly - Perhaps she'll die!

There was an old lady that swallowed a dog;
What a hog, to swallow a dog;
She swallowed the dog to catch the cat,
She swallowed the cat to catch the bird,
She swallowed the bird to catch the spider,
She swallowed the spider to catch the fly;
I don't know why she swallowed a fly - Perhaps she'll die!

There was an old lady who swallowed a cow,
I don't know how she swallowed a cow;
She swallowed the cow to catch the dog,
She swallowed the dog to catch the cat,
She swallowed the cat to catch the bird,
She swallowed the bird to catch the spider,
She swallowed the spider to catch the fly;
I don't know why she swallowed a fly - Perhaps she'll die!

There was an old lady who swallowed a horse...
She's dead, of course!
 */