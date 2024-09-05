class Set_Matrix_Zeroes73 {
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] r = new int[n];
        int[] c = new int[m];
        for (int i = 0; i < n; i++) {
            r[i] = 1;
        }
        for (int i = 0; i < m; i++) {
            c[i] = 1;
        }
        System.out.println("Before set_Matrix_Zeroes");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    r[i] = 0;
                    c[j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0 || r[i] == 0 || c[j] == 0) {
                    matrix[i][j] = 0;
                }

            }

        }
        System.out.println("After set matrix zero");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 2, 0 },
                        { 3, 4, 5, 2 },
                        { 1, 3, 1, 5 }};
        setZeroes(arr);
    }
}