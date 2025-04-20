package com.pk.completejava.multithreading;

public class th extends Thread {

    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println("test " + (i+1));
        }
    }
}
