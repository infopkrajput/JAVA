class A{
	int x=10;
	A(){
		System.out.println("HI A");
	}
	A(int a){
		this();
		System.out.println("Hello A");
		x=a;
	}
}
class B extends A{
	B (int b){
		x=b;
		System.out.println("Hi B");
		
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b=new B(5);
System.out.println(b.x);
A a=new A(3);
System.out.println(a.x);
	}
}

