public class Main extends Thread{
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int x = 2;
                for(int i = 1; i<=10;i++){
                    System.out.println(x + " * " + i + " = " + x * i );
                    try{
                        Thread.sleep(500);
                    }catch (Exception e){
                        System.out.println("Exception : " + e);
                    }
                }
            }
        });
        thread.start();
    }
}