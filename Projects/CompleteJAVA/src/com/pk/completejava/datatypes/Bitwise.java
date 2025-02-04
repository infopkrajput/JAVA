package com.pk.completejava.datatypes;

public class Bitwise {
    public static void main(String[] args) {
        // Bitwise operators
        // & - Bitwise AND
        // | - Bitwise OR
        // ^ - Bitwise XOR
        // ~ - Bitwise Complement
        // << - Left Shift
        // >> - Right Shift

        int a = 10;
        int b = 20;
        int c = a & b;
        System.out.println("Bitwise AND of a and b is: " + c);

        int d = a | b;
        System.out.println("Bitwise OR of a and b is: " + d);

        int e = a ^ b;
        System.out.println("Bitwise XOR of a and b is: " + e);

        int f = ~a;
        System.out.println("Bitwise Complement of a is: " + f);

        int g = a << 2;
        System.out.println("Left Shift of a is: " + g);

        int h = a >> 2;
        System.out.println("Right Shift of a is: " + h);
    }
}
