package com.pk.completejava.controlflow;

public class Switch {
    public static void main(String[] args) {
        int marks = 65;
        switch (marks / 10) {
            case 10:
            case 9:
                System.out.println("A+ Grade");
                break;
            case 8:
                System.out.println("A Grade");
                break;
            case 7:
                System.out.println("B Grade");
                break;
            case 6:
                System.out.println("C Grade");
                break;
            case 5:
                System.out.println("D Grade");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
