public class temp {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 2, 1 };
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                System.out.println("yes");
            }

        }
        System.out.println("no");
    }
}
