public class ch7A_a {
    public static void main(String[] args) {
        int a = 10, b = 20;
        // This function modify give syntax error because modify() method have two arguments but we call it without any method. 
        // modify();
        System.out.println(a + " " + b);
    }

    static void modify(int a, int b) {
        a++;
        b++;
    }

}
