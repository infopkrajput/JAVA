package com.pk.completejava.controlflow;

public class WhilLoop {
    public static void main(String[] args) {
        int i = 15000;
        while (i > 0) {
            System.out.println("Hello World " + i);
            i /= 3;
        }
    }
}
