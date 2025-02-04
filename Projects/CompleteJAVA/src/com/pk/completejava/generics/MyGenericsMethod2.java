package com.pk.completejava.generics;
public class MyGenericsMethod2<A,B> {
    private A a;
    private B b;

    MyGenericsMethod2(A a, B b){
        this.a = a;
        this.b = b;
    }
    public void display(){
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
    }
    public void setAB(A a, B b){
        this.a = a;
        this.b = b;
    }
}
