class A{
	int x;
	static int y=34;
	void show() {
		System.out.println(x+" "+y);
	}
	
	
	static {
		System.out.println("hello");
		System.out.println("Byee");
	}
}
public class StaticBlockEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello Main");
System.out.println(A.y);
System.out.println(A.y);
A a=new A();
a.x=14;
a.show();
	}
}
	