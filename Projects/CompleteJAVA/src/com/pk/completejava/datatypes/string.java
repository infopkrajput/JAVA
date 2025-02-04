package com.pk.completejava.datatypes;

public class string {
    public static void main(String[] args) {
        // String is a sequence of characters
        // String is a class in Java
        // String is immutable
        // String is a reference data type
        // String basically created in two ways:
        // 1. String literal
        // 2. Using new keyword
        System.out.println("How to create a String in Java?");
        String name = "Praveen";
        System.out.println(name);
        String name1 = new String("Praveen");
        System.out.println(name1);
        //Output: Praveen, Praveen

        // String Concatenation
        System.out.println("String Concatenation");
        String firstName = "Praveen";
        String lastName = "Kumar";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        //Output: Praveen Kumar

        // Strings created in String Pool
        System.out.println("String Pool");
        String name2 = "Praveen";
        String name3 = "Praveen";
        System.out.println(name2 == name3);
        //Output: true

        // Strings created in Heap Memory
        System.out.println("Heap Memory");
        String name4 = new String("Praveen");
        String name5 = new String("Praveen");
        System.out.println(name4 == name5);
        //Output: false

        // String Comparison
        System.out.println("String Comparison via equals() method");
        String name6 = "Praveen";
        String name7 = "Praveen";
        System.out.println(name6.equals(name7));
        //Output: true

        // String Comparison
        System.out.println("String Comparison via equalsIgnoreCase() method");
        String name8 = "Praveen";
        String name9 = "praveen";
        System.out.println(name8.equalsIgnoreCase(name9));
        //Output: true

        // String Comparison
        System.out.println("String Comparison via compareTo() method");
        String name10 = "Praveen";
        String name11 = "Praveen";
        System.out.println(name10.compareTo(name11));
        //Output: 0

        // String Comparison
        System.out.println("String Comparison via compareToIgnoreCase() method");
        String name12 = "Praveen";
        String name13 = "praveen";
        System.out.println(name12.compareToIgnoreCase(name13));
        //Output: 0

        System.out.println("Methods in String class");
        // String Methods
        // String contains() method
        System.out.println("String contains() method");
        String name16 = "Praveen";
        String name17 = "Praveen";
        System.out.println(name16.contains("P"));
        System.out.println(name17.contains("K"));
        //Output: true, false

        // String substring() method
        System.out.println("String substring() method");
        String name18 = "Praveen";
        String name19 = "Praveen";
        System.out.println(name18.substring(2));
        //Output: aveen
        System.out.println(name19.substring(2, 5));
        //Output: aveen

        // String trim() method
        System.out.println("String trim() method");
        String name20 = "    Praveen    ";
        System.out.println(name20.trim());
        //Output: Praveen

        // String replace() method
        System.out.println("String replace() method");
        String name21 = "Praveen";
        System.out.println(name21.replace("P", "K"));
        //Output: Kraveen

        // String split() method
        System.out.println("String split() method");
        String name22 = "Praveen Kumar";
        String[] name23 = name22.split(" ");
        for (String n : name23) {
            System.out.println(n);
        }
        //Output: Praveen

        // String indexOf() method
        System.out.println("String indexOf() method");
        String name24 = "Praveen";
        System.out.println(name24.indexOf("v"));
        //Output: 3

        // String lastIndexOf() method
        System.out.println("String lastIndexOf() method");
        String name25 = "Praveen";
        System.out.println(name25.lastIndexOf("e"));
        //Output: 5

        // String charAt() method
        System.out.println("String Comparison via charAt() method");
        String name26 = "Praveen";
        System.out.println(name26.charAt(2));
        //Output: a

        // String toLowerCase() method
        System.out.println("String toLowerCase() method");
        String name27 = "PRAVEEN";
        System.out.println(name27.toLowerCase());
        //Output: praveen

        // String toUpperCase() method
        System.out.println("String toUpperCase() method");
        String name28 = "praveen";
        System.out.println(name28.toUpperCase());
        //Output: PRAVEEN

        // String valueOf() method
        System.out.println("String valueOf() method");
        int a = 10;
        String name29 = String.valueOf(a);
        System.out.println(name29);
        //Output: 10

        // String length() method
        System.out.println("String length() method");
        String name30 = "Praveen";
        System.out.println(name30.length());
        //Output: 7

        // String isEmpty() method
        System.out.println("String isEmpty() method");
        String name31 = "";
        System.out.println(name31.isEmpty());
        //Output: true

        // String startsWith() method
        System.out.println("String startsWith() method");
        String name32 = "Praveen";
        System.out.println(name32.startsWith("P"));
        //Output: true

        // String endsWith() method
        System.out.println("String endsWith() method");
        String name33 = "Praveen";
        System.out.println(name33.endsWith("n"));
        //Output: true

        // String join() method
        System.out.println("String join() method");
        String name34 = String.join("-", "Praveen", "Kumar");
        System.out.println(name34);
        //Output: Praveen-Kumar

        // String repeat() method
        System.out.println("String repeat() method");
        String name35 = "Praveen";
        System.out.println(name35.repeat(2));
        //Output: PraveenPraveen

        // String strip() method
        System.out.println("String strip() method");
        String name36 = "    Praveen    ";
        System.out.println(name36.strip());
        //Output: Praveen
        // difference between strip and trim is that strip() method removes the leading and trailing white spaces whereas trim() method removes the leading and trailing white spaces and also the white spaces between the characters

        // String stripLeading() method
        System.out.println("String stripLeading() method");
        String name37 = "    Praveen    ";
        System.out.println(name37.stripLeading());
        //Output: Praveen

        // String stripTrailing() method
        System.out.println("String stripTrailing() method");
        String name38 = "    Praveen    ";
        System.out.println(name38.stripTrailing());
        //Output:     Praveen


        // String isBlank() method
        System.out.println("String isBlank() method");
        String name39 = "";
        System.out.println(name39.isBlank());
        //Output: true

        // String lines() method
        System.out.println("String lines() method");
        String name40 = "Praveen\nKumar";
        name40.lines().forEach(System.out::println);
        //Output: Praveen, Kumar

        // String codePoints() method
        System.out.println("String codePoints() method");
        String name41 = "Praveen";
        name41.codePoints().forEach(System.out::println);
        //Output: 80, 114, 97, 118, 101, 101, 110

        // String toCharArray() method
        System.out.println("String toCharArray() method");
        String name42 = "Praveen";
        char[] name43 = name42.toCharArray();
        for (char n : name43) {
            System.out.println(n);
        }
        //Output: P, r, a, v, e, e, n

        // String getBytes() method
        System.out.println("String getBytes() method");
        String name44 = "Praveen";
        byte[] name45 = name44.getBytes();
        for (byte n : name45) {
            System.out.println(n);
        }
        //Output: 80, 114, 97, 118, 101, 101, 110

        // String format() method
        System.out.println("String format() method");
        String name46 = "Praveen";
        String name47 = "Kumar";
        String name48 = String.format("My name is %s %s", name46, name47);
        System.out.println(name48);
        //Output: My name is Praveen Kumar

        // String intern() method
        System.out.println("String intern() method");
        String name49 = new String("Praveen");
        String name50 = name49.intern();
        System.out.println(name50);
        //Output: Praveen

        // String replaceAll() method
        System.out.println("String replaceAll() method");
        String name51 = "Praveen";
        System.out.println(name51.replaceAll("P", "K"));
        //Output: Kraveen

        // String replaceFirst() method
        System.out.println("String replaceFirst() method");
        String name52 = "Praveen";
        System.out.println(name52.replaceFirst("P", "K"));
        //Output: Kraveen

        // String matches() method
        System.out.println("String matches() method");
        String name53 = "Praveen";
        System.out.println(name53.matches("Praveen"));
        //Output: true

        // String toLowerCase(Locale) method
        System.out.println("String toLowerCase(Locale) method");
        String name54 = "PRAVEEN";
        System.out.println(name54.toLowerCase());
        //Output: praveen


        // String toUpperCase(Locale) method
        System.out.println("String toUpperCase(Locale) method");
        String name55 = "praveen";
        System.out.println(name55.toUpperCase());
        //Output: PRAVEEN

        // String valueOf(char[]) method
        System.out.println("String valueOf(char[]) method");
        char[] name56 = {'P', 'r', 'a', 'v', 'e', 'e', 'n'};
        String name57 = String.valueOf(name56);
        System.out.println(name57);
        //Output: Praveen




    }
}
