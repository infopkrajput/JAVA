package com.pk.completejava.generics;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // we can use generics in two ways
        // 1. Generics with class
        // 2. Generics with method

        // 1. Generics with class
        // Here we are creating an object of the class MyGenericsClass
        // and passing the type of the object as Integer
        System.out.println("Generics with class");
        MyGenericsClass<String> my = new MyGenericsClass<>();
        my.setVar("hello");
        System.out.println("Inserted data type is " + my.getVar().getClass().getName());
        System.out.println(my.getVar());
        // Here we are creating an object of the class MyGenericsClass
        // and passing the type of the object as String
        // Then we can use only string type of data

        // 2. Generics with method
        // Here we are creating an object of the class MyGenericsMethod
        // and passing the type of the object as Integer
        System.out.println("Generics with ArrayList");
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        System.out.println(l.get(0).getClass().getName());
        System.out.println(l.get(0));

        // we can use multiple types of data in the same class
        System.out.println("Generics with multiple types of data");
        MyGenericsMethod2<String, Integer> x = new MyGenericsMethod2<>("Age",30);
        x.display();
        x.setAB("Age", 20);
        x.display();

        System.out.println("Generics with interface");
        MyGenericsInterfaceChild<String> y = new MyGenericsInterfaceChild<>();
        MyGenericsInterfaceChild<Integer> z = new MyGenericsInterfaceChild<>();
        y.setVar("Hello");
        z.setVar(10);
        System.out.println(y.getVar());
        System.out.println(z.getVar());
        System.out.println("Generics with bounded type");
        MyGenericsWithBoundedType <Integer> a = new MyGenericsWithBoundedType<>();
        a.setVar(30);
        System.out.println(a.getVar());
    }
}