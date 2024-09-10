package leetCode;
public class Cells_with_Odd_Values_in_a_Matrix_1252 {
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int[] temp = new int[indices.length * indices[0].length];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices[0].length; j++) {
                temp[k++] = indices[i][j]; 
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[temp[i]][j]++;
                }
            }
            else
            {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][temp[i]]++;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
                if(matrix[i][j]%2!=0)
                {
                    sum++;
                }
            }            
            System.out.println();
        }
        return sum;
    }

    public static void main(String[] args) {
        int m = 2;
        int n = 2;
        int[][] arr = { { 1, 1 }, { 0, 0 } };
        int x = oddCells(m, n, arr);
        System.out.println(x);
    }
}