package com.pk.completejava.multithreading;

public class th1 extends Thread {

    @Override
    public void run() {
        for (int i = 1;i<=10;i++){
            try {
                Thread.sleep(1000);
                System.out.println("Thread1 " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
