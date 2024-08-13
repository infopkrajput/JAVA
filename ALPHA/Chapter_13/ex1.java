package ALPHA.Chapter_13;
public class ex1 {
    public static int arrayCheck(int num[]) {
        int n = num.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (num[i] == num[j]) {
                    return 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3 };
        int x = arrayCheck(num);
        if (x == 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}
