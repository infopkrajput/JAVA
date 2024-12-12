public class test {
    public static void display(String a) {
        System.out.print("Printing String : ");
        System.out.println(a);
    };
    public static void display(int a) {
        System.out.print("Printing integer : ");
        System.out.println(a);
    };
    public static void main(String[] args) {
        int a = 325;
        String y = ""+a;
        String x = String.valueOf(a);

        display(y);
    }
}
