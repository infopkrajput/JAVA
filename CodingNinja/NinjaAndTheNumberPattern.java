/*
 int n = 4
4444444
4333334
4322234
4321234
4322234
4333334
4444444
 */
public class NinjaAndTheNumberPattern {
    public static void getNumberPattern(int n) {
        // Write your code here.
        int[][] mat = new int[2 * n - 1][2 * n - 1];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < 2 * n - i - 1; j++) {
                for (int k = i; k < 2 * n - i - 1; k++)
                    mat[j][k] = n - i;
            }
        }
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        getNumberPattern(n);
    }

}
