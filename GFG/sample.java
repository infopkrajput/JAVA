public class sample {
    public static int findMax(int[][] arr) {
        // int[] len = new int[arr.length];
        // for (int i = 0; i < len.length; i++) {
        // len[i] = 0;
        // }
        int sum = 0;
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                // len[i] = len[i] + arr[i][j];
                sum = sum + arr[i][j];
            }
            if (sum > temp) {
                temp = sum;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { -1, -5 },
                { -7, -3 },
                { -3, -5 }, };
        int x = findMax(arr);
        System.out.println(x);
    }

}