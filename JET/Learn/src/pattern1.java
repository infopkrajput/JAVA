public class pattern1 {
    public static void main(String[] args) {
        int n = 4;
        int k = 1;
        for (int i = 1; i <= n; i++) {
            if(i%2!=0)
                k=1;
            else
                k=0;
            for (int j = 1; j <= i; j++) {
                if(k%2!=0)
                {
                    System.out.print(k);
                    k--;
                }
                else
                {
                    System.out.print(k);
                    k++;
                }
            }
            System.out.println();
        }
    }
}
