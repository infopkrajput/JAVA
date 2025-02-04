package com.pk.completejava.oops.interfaces.forabstraction;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sleep();
        System.out.println("Dog's legs are : " + d.legs);
        System.out.println("Dog's tail : " + Animal.tail);
    }
}
