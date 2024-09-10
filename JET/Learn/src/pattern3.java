public class pattern3 {
    public static void main(String[] args) {

        // 1             1
        // 1 2         2 1
        // 1 2 3     3 2 1
        // 1 2 3 4 4 3 2 1
        int n = 4, k;
        for (int i = 1; i <= n; i++) {
            k = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            for (int j = n * 2 - 1; j >= i + i; j--) {
                System.out.print("  ");
            }
            k--;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k--;
            }
            System.out.println();
        }
    }
}
