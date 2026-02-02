// Write a program that takes a set of names of individuals and abbreviates the first, middle and other names except the last name by their first letter.
package chapter12;

public class ch12Ce {
    static void main() {
        String fullName = "John Michael Doe";
        String[] nameParts = fullName.split(" ");
        StringBuilder abbreviatedName = new StringBuilder();
        for (int i = 0; i < nameParts.length; i++) {
            if (i < nameParts.length - 1) {
                abbreviatedName.append(nameParts[i].charAt(0)).append(". ");
            } else {
                abbreviatedName.append(nameParts[i]);
            }
        }
        System.out.println("Original name: " + fullName);
        System.out.println("Abbreviated name: " + abbreviatedName.toString().trim());
    }
}
