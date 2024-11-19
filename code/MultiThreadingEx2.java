class AAA extends Thread{
	public void run() {
		System.out.println("A1");
		System.out.println("A2");
		System.out.println("A3");
		System.out.println("A4");
		System.out.println("A5");
		System.out.println("A6");
		
	}
	
}

class BBB extends Thread{
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

class CCC extends  Thread{


public void run() {
	

	System.out.println("C1");
	System.out.println("C2");
	System.out.println("C3");
	System.out.println("C4");
	System.out.println("C5");
	System.out.println("C6");


}
	
}
public class MultiThreadingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Main");
		AAA a=new AAA();
		
		a.start();
		System.out.println("Hii Main");
		BBB b=new BBB();
		
		b.start();
		System.out.println("Ok Main");
		CCC c=new CCC();
		
		c.start();
		System.out.println("Byee Main");
	}
}

