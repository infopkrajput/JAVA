class AA implements Runnable{
	public void run() {
		System.out.println("A1");
		System.out.println("A2");
		System.out.println("A3");
		System.out.println("A4");
		System.out.println("A5");
		System.out.println("A6");
		
	}
	
}

class BB implements Runnable{
	public void run() {
	System.out.println("B1");
	System.out.println("B2");
	System.out.println("B3");
	System.out.println("B4");
	System.out.println("B5");
	System.out.println("B6");
	System.out.println("B1");
	System.out.println("B2");
	System.out.println("B3");
	System.out.println("B4");
	System.out.println("B5");
	System.out.println("B6");
	System.out.println("B1");
	System.out.println("B2");
	System.out.println("B3");
	System.out.println("B4");
	System.out.println("B5");
	System.out.println("B6");
	
}
}

class CC implements Runnable{


public void run() {
	

	System.out.println("C1");
	System.out.println("C2");
	System.out.println("C3");
	System.out.println("C4");
	System.out.println("C5");
	System.out.println("C6");


}
	
}
public class MultiThreadingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Main");
		AA a=new AA();
		Thread t1=new Thread(a);
		t1.start();
		System.out.println("Hii Main");
		BB b=new BB();
		Thread t2=new Thread(b);
		t2.start();
		System.out.println("Ok Main");
		CC c=new CC();
		Thread t3=new Thread(c);
		t3.start();
		System.out.println("Byee Main");
	}
}

