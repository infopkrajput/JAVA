package com.pk.completejava.multithreading;

public class th2 extends Thread{
    @Override
    public void run() {
        for (int i = 1;i<=10;i++){
            System.out.println("Thread2 " + i);
        }
    }
}
