interface AA{
	void m();
	default void xyz() {
		System.out.println("hello xyz");
		
	}
}

interface cc{
	void m2();
	default void xyz() {
		System.out.println("Hii xyz");
	}
}

class B implements AA{
	public void m() {
		System.out.println("Hii B");
		xyz();
		
	}
public void m2() {
	System.out.println("Hii m2");
}
}
class BB implements AA,cc{
	public void m() {
		
	}
	public void m2() {
		
	}
	public void xyz() {
	}
	}
		
public class defaultStaticEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b1=new B();
b1.m();
b1.xyz();
b1.m2();
AA a1=new B();
a1.m();
a1.xyz();
//a1.m2(); //error
	}
}
	