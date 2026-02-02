//Write a program to delete all vowels from a sentence.
package chapter12;

public class ch12Cc {
    static void main() {
        String sentence = "This is an example sentence to demonstrate vowel removal.";
        String result = sentence.replaceAll("[AEIOUaeiou]", "");
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Sentence without Vowels: " + result);
    }
}
