public class unit1_3 {
    public static void main(String[] args) {
        int [][]a = {{1,2},{3,4}};
        int [][]b = {{4,5},{6,8}};
        int [][]c = {{0,0},{0,0}};
        System.out.println("Matrix a ");
        for(int i = 0;i < 2;i++)
        {
            for(int j = 0;j < 2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix b");
        for(int i = 0;i < 2;i++)
        {
            for(int j = 0;j < 2;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0;i < 2;i++)
        {
            for(int j = 0;j < 2;j++){
                for(int k = 0;k < 2;k++){
                    c[i][j] = c[i][j] +  a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Product of matrix : ");
        for(int i = 0;i < 2;i++)
        {
            for(int j = 0;j < 2;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }



    }
}
