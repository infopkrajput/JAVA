public class pattern7 {
    public static void main(String[] args) {
        int n = 4;
        char k;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            // characters
            k = 'A';
            for (int j = 1; j < i * 2; j++) {
                if (j < i) {

                    System.out.print(k + " ");
                    k++;
                } else {

                    System.out.print(k + " ");
                    k--;
                }
            }

            // spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            // System.out.print("*");
            System.out.println();
        }
    }
}
/*
 * A
 * A B A
 * A B C B A
 * 
 * 
 */