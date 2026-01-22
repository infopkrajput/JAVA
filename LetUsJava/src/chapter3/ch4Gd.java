// A cashier has currency notes of denominations 10, 50 and 100. If the amount of withdrawn is input through the keyboard, write a program to find the minimum number of currency notes of each denomination the cashier will have to give to the withdrawer.
package chapter3;

public class ch4Gd {
    public static void main(String[] args) {
        int population = 80000;
        int TotalMan = population * 52 / 100;
        int TotalWoman = 80000 - TotalMan;
        int TotalLiterateMan = population * 35 / 100;
        int TotalLiterateWomen = population * 48 / 100 - TotalLiterateMan;
        int TotalIlliterateMan = TotalMan - TotalLiterateMan;
        int TotalIlliterateWomen = TotalWoman - TotalLiterateWomen;
        System.out.println("Total literate men: " + TotalIlliterateMan);
        System.out.println("Total illiterate women: " + TotalIlliterateWomen);
    }
}
