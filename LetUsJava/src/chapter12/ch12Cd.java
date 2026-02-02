//Write a program that will read a line and delete from it all occurrences of the word 'the'.
package chapter12;

public class ch12Cd {
    static void main() {
        String line = "the quick brown fox jumps over the lazy dog";
        String wordToRemove = "the";
        String modifiedLine = line.replaceAll("\\b" + wordToRemove + "\\b", "").replaceAll(" +", " ").trim();
        System.out.println("Original line: " + line);
        System.out.println("Modified line: " + modifiedLine);
    }
}
