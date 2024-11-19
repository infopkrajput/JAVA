class Q{
	void m1() {
		System.out.println("hello Q");
	}
	void m2() {
		System.out.println("hii Q");
		
	}
}
class T extends Q{
	void m() {
		System.out.println("hello t");
	}
	void m1() {
		System.out.println("hii t");
		
	}
}
public class RuntimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
T t1=new T();
t1.m();
t1.m1();
t1.m2();
Q q1=t1;
q1.m1();
q1.m2();
}
	}


