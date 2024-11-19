interface A{
	public static final int x=12;
	//by default public static final
	void m();
	abstract public void m1();
	
}
class j1 implements A{
	
	public void m() {
		System.out.println(x);
		
	}
	
	public void m1() {
		System.out.println("Hii");
		
	}
}
public class InterfaceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(A.x);
A a1=new j1();
a1.m();
a1.m1();
System.out.println(a1.x);
	}
}

	
