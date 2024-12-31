import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            int a = 2;
            for (int i = 1; i <= 40; i++) {
                System.out.println(a + " * " + i + " = " + a * i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        });
        // Start the thread
        t1.start();

        char x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to stop the thread : ");
        x = sc.next().charAt(0);
        if (x == 'y') {
            t1.interrupt();
        }

    }
}
