package LetUsJAVA.chapter3;

public class ch4Gd {

    public static void main(String[] args) {
        int population = 80000;
        int TotalMan = population * 52/100;
        int TotalWoman = 80000 - TotalMan;
        int TotalLiterateMan  = population * 35/100;
        int TotalLiterateWomen = population * 48/100 - TotalLiterateMan;
        int TotalIllitrateMan = TotalMan - TotalLiterateMan;
        int TotalIllitrateWomen = TotalWoman - TotalLiterateWomen;
        System.out.println("Total literate men: " + TotalIllitrateMan);
        System.out.println("Total illiterate women: " + TotalIllitrateWomen);
       }
}
