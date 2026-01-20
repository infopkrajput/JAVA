package Unit5;

// Renamed classes to A2/B2 to avoid duplicate symbols with Access.java
class A2 {
    int i;
    private int j;
    void setij(int x,int y){ i=x; j=y; }
    void showij(){ System.out.println("i = " + i + " j = " + j); }
}

class B2 extends A2{
    int k;
    void setk(int v){ k=v; }
    void showk(){ System.out.println("k = " + k); }
}

class SimpleInheritance{
    public static void main(String args[]){
        A2 superOb = new A2();
        B2 subOb = new B2();
        superOb.setij(10,20);
        superOb.showij();

        subOb.setij(1,2);
        subOb.setk(9);
        subOb.showij();
        subOb.showk();
    }
}