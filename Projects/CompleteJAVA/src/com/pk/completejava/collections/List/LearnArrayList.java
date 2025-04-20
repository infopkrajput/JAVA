package com.pk.completejava.collections.List;

import java.net.Inet4Address;
import java.util.*;
import java.util.LinkedList;


public class LearnArrayList {
    public static void main(String[] args) {
        // ArrayList is a part of Collection framework and is present in java.util package.
        // It provides us dynamic arrays in Java.
        // we can store data in order and maintain insertion order.

        List<String> arr = new LinkedList<>();
        arr.add("Pushpendra");
        arr.add("Nayan");
        arr.add("Sujeet");
        arr.add("Ravi");
        arr.add("Ravi");
        arr.add("Rohan");

        System.out.println(arr);

        Set<Integer> sc = new HashSet<>();
        sc.add(10);
        sc.add(20);
        sc.add(30);
        sc.add(40);

        System.out.println(sc);

        Set<Integer> ts = new TreeSet<>();
        ts.add(20);
        ts.add(30);
        ts.add(10);
        ts.add(40);

        System.out.println(ts);







    }
}
