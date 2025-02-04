package com.pk.completejava.oops.interfaces.forabstraction;

public interface Animal {
    // Achieving multiple inheritance
    // no need to write public static final as by default it is public static final
    public static final int legs = 4;

    // without using public static final
    int tail = 1;

    // Achieving abstraction
    // no need to write public abstract as by default it is public abstract
    public abstract void eat();

    // without using public abstract
    void sleep();

    // this method is static and can be called using interface name
    public static void run(){
        System.out.println("Animal is running");
    }

    // this method is default and can be called using object of class implementing this interface
    public default void walk(){
        System.out.println("Animal is walking");
    }
}
