package com.pk.completejava.generics;

public class MyGenericsWithWildcard {
    public static void main(String[] args) {
        Integer[] arr = {1, 1, 2, 3, 4, 5};
        display(arr);
    }

    public static <T> void display(T[] var){
        for (T o : var){
            System.out.print(o+" ");
        }
    }
}