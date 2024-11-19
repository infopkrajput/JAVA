
public class A1 {
	int x = 10;
	String y = "Rahul";

	void show() {
		System.out.println(x + y);
	}
}

class ss {
	public static void main(String[] args) {
		A1 a = new A1();
		A1 b = new A1();
		a.x = 15;
		a.show();
		a.y = "YoYo";
		b.show();
		b.y = "Ramu";
		a.show();
		b.show();
	}
}
