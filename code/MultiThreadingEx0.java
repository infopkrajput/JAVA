class A{
	void m1() {
		System.out.println("A1");
		System.out.println("A2");
		System.out.println("A3");
		System.out.println("A4");
		System.out.println("A5");
		System.out.println("A6");
		
	}
	
}

class B{
	void m2() {
	System.out.println("B1");
	System.out.println("B2");
	System.out.println("B3");
	System.out.println("B4");
	System.out.println("B5");
	System.out.println("B6");
	
}
}

class C{


void m3() {
	

	System.out.println("C1");
	System.out.println("C2");
	System.out.println("C3");
	System.out.println("C4");
	System.out.println("C5");
	System.out.println("C6");


}
	
}
public class MultiThreadingEx0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Main");
		A a=new A();
		a.m1();
		System.out.println("Hii");
		B b=new B();
		b.m2();
		System.out.println("Ok Main");
		C c=new C();
		c.m3();
		System.out.println("Byee Main");
	}
}

