public class pattern6 {
    public static void main(String[] args) {
        int n = 3;
        char k;
        for(int i =1;i<=n;i++)
        {
            k = 'A';
            k += n-1;
            for(int j =1;j<=i;j++)
            {
                System.out.print(k+" ");
                k--;
            }
            
            System.out.println();
        }
    }
    
}
