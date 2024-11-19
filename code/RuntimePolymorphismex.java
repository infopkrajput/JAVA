class Parent{
	void m() {
		System.out.println("Hi from parent");
		
	}
}
class Child1 extends Parent{
	void m() {
		System.out.println("hii from child 1");
	}
	void m1() {
		System.out.println("hello child");
	}
}
class Child2 extends Parent{
	void m() {
		System.out.println("Hii from child 2");
		}
}
public class RuntimePolymorphismex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p1=new Parent();
p1.m();
p1=new Child1();
p1.m();
p1=new Child2();
p1.m();

Parent p4=new Parent();
p4.m();
Parent p2=new Child1();
p2.m();
Parent p3=new Child2();
p3.m();
	}
}
