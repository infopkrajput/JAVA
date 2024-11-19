abstract class A {
	int x = 88;
	static int y = 12;

	A() {
		System.out.println("hii A");
	}

	{
		System.out.println("hello A");

	}
	static {
		System.out.println("static");
	}

}

class B extends A {

}

public class AbstractEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B();
		System.out.println(b1.x + " " + b1.y);
	}

}
