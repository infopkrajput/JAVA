package com.pk.completejava.controlflow;

public class Ternary {
    public static void main(String[] args) {
        int marks = 65;
        String result = (marks < 50) ? "Fail" : (marks >= 50 && marks < 60) ? "D Grade" : (marks >= 60 && marks < 70) ? "C Grade" : (marks >= 70 && marks < 80) ? "B Grade" : (marks >= 80 && marks < 90) ? "A Grade" : (marks >= 90 && marks <= 100) ? "A+ Grade" : "Invalid Marks";
        System.out.println(result);
    }
}
