package com.pk.completejava.multithreading;

public class Main {
    public static void main(String[] args) {

        th1 a = new th1();
        th2 b = new th2();

        a.start();
        b.start();
    }
}
