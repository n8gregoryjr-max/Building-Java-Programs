package Chapter06.Exercises;

public class Exercise20 {
}
/*
Write a method called pigLatin that accepts as a parameter a Scanner representing an input file.
Your method should, preserving line breaks, print out the input file’s text in a simplified version of Pig Latin,
a silly English variant where the first letter of each word is moved to the end.

Our rules for translating a word to Pig Latin are as follows:
- If the word starts with a vowel (a, e, i, o, or u), append "yay". For example, "elephant" becomes "elephantyay".
- If the word starts with a consonant, move the consonant to the end, and append "ay". For example, "welcome" becomes "elcomeway".

You should also convert every word to lowercase. For example, if the input file contains the following text:

    Shall I compare thee to
    a summer's day Thou art more
    lovely and more temperate

For the preceding input, your method should produce the following console output:

    hallsay iyay omparecay heetay otay
    ayay ummer'ssay ayday houtay artyay oremay
    ovelylay andyay oremay emperatetay

 */