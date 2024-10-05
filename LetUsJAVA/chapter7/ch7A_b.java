public class ch7A_b {
    public static void main(String[] args) {
        int i = 45, c;
        c = check(i);
        System.out.println(c);
    }

    static int check(int ch) {
        if (ch >= 45) {
            return (100);
        } else {
            return (10);
        }
    }

}
