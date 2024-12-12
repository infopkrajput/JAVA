public class OneMultiThread extends Thread {

    public static void one(String data) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(data + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void two(String data) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(data + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                one("First data: ");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                two("Second data: ");
            }
        });
        thread1.start();
        thread2.start();
    }
}