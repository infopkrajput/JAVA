public class pattern5 {
    public static void main(String[] args) {
        int n = 3;
        char k;
        k = 'A';
        for(int i =1;i<=n;i++)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print(k+" ");
            }
            k++;
            System.out.println();
        }
    }
    
}
