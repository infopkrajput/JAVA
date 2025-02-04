package com.pk.completejava.controlflow;

public class ForEachChar {
    public static void main(String[] args) {
        String str = "Hello";
        for (char c : str.toCharArray()) {
            System.out.println(c);
        }
    }
}
