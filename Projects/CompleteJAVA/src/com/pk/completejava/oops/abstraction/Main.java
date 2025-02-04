package com.pk.completejava.oops.abstraction;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.eat();
        Animal cat = new Cat();
        cat.sound();
        cat.eat();
    }
}
