package Unit8;

class MainDaemon {
    public static void main(String[] args) {
        // create daemon thread
        Thread dt = new Thread(new Runnable() {
            int counter = 1;
            @Override
            public void run() {
                while (true) {
                    // This thread will run until the main thread is terminated
                    System.out.println("Daemon thread running " + counter++ + " times");
                    try {
                        // This thread run in every 0.5 seconds
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Thread terminated with some interruption");
                        return;
                    }
                }
            }
        });
        // set the thread as daemon
        dt.setDaemon(true);
        // start the thread
        dt.start();
        System.out.println("Main thread started");
        try {
            // This main thread will run for 5 seconds
            Thread.sleep(5000);
        } catch (InterruptedException e) {

            System.out.println("Thread terminated with some interruption");
        }
        System.out.println("Main thread terminated");
    }
}