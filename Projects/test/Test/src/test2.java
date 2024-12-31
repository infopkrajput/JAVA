public class test2 extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++) {
            System.out.println("Thread running " + Thread.currentThread().getName());
            try{
                Thread.sleep(3500);
            }
            catch (InterruptedException e){
                System.out.println("Error");
            }
        }
    }
}
