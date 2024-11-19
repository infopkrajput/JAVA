 class A {
int x;
A(){
	System.out.println("Hi A");
	x=10;
}
}

class B extends A{
	int y;
	B(){
		System.out.println("Hello B");
		x=15;
	}
	void show() {
		System.out.println(x);
		System.out.println(y);
		
	}
}
 public class A{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b= new B();
b.show();
	}
 }

