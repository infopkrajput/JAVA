


public class A2{
	String name;
	private int age;
	String color;
	void input() {
	name="xyz";
	age=15;
	}
	void show() {
	System.out.println(name+age+color);
	}
	}
	 class kajol {
	public static void main(String[] args) {
	A2 a= new A2();
	a.show();
	a.input();
	A2 b= new A2();
	a.show();
	b.show();
	}
	}
