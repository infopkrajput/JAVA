package com.pk.completejava.oops.interfaces.formultipleinheritance;

public class Smartphone implements recording, messaging, Calling {
    public void record() {
        System.out.println("Recording...");
    }

    public void play() {
        System.out.println("Playing...");
    }

    public void message() {
        System.out.println("Messaging...");
    }

    public void chat() {
        System.out.println("Chatting...");
    }

    public void call() {
        System.out.println("Calling...");
    }

    public void dial() {
        System.out.println("Dialing...");
    }
}
