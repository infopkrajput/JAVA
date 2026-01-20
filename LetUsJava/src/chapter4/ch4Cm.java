import java.util.*;

public class ch4Cm {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        String result = (ch >= 'a' && ch <= 'z') ? "Lowercase" : "Uppercase";
        System.out.println(result);
    }
}
