// Write a program that uses an array of strings str[ ]. Receive two strings str1 and str2 and check if str1 is embedded in any of the strings in str[ ]. If str1 is found, then replace it with str2.
// String[] str = {
//                "We will teach you how to...",
//                "Move a mountain",
//                "Erase the past",
//                "Make a million",
//                "...all through Java!"
//        };
// For example if str1 contains "mountain" and str2 contains "car", then the second string in str should get changed to "Move a car".
package chapter12;

public class ch12Ca {
    static void main() {
        String[] str = {
                "We will teach you how to...",
                "Move a mountain",
                "Erase the past",
                "Make a million",
                "...all through Java!"
        };

        String str1 = "mountain";
        String str2 = "car";

        for (int i = 0; i < str.length; i++) {
            if (str[i].contains(str1)) {
                str[i] = str[i].replace(str1, str2);
            }
        }

        for (String s : str) {
            System.out.println(s);
        }
    }
}
