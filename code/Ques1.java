abstract class Aa{
	final void m() {
		System.out.println("Hii A");
	}
	{
		System.out.println("Initialize");
	}
	abstract void m1();
	
}
class B extends A{
	void m1() {
		System.out.println("hello B");
	}
	static {
		System.out.println("Hii");
	}
	void m(int x) {
		System.out.println("hii B");
	}
}
public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b1=new B();
b1.m();
	}
}
	
