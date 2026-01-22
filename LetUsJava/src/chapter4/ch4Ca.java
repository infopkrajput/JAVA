// If cost price and selling price of an item is input through the keyboard, write a program to determine whether the seller has made profit or incurred loss. Also determine how much profit he made or loss he incurred.
package chapter4;

import java.util.Scanner;

public class ch4Ca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the purchasing price : ");
        int purchasePrice = sc.nextInt();
        System.out.print("Enter the selling price : ");
        int salesPrice = sc.nextInt();
        if (salesPrice - purchasePrice > 0) {
            System.out.println("Seller made profit of Rs. " + (salesPrice - purchasePrice));
        } else if (salesPrice - purchasePrice < 0) {
            System.out.println("Seller made loss of Rs. " + (purchasePrice - salesPrice));
        } else {
            System.out.println("Seller made no loss no profit.");
        }

    }
}
