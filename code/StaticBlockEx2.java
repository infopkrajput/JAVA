class B{
	int x=12;
	static int y=34;
	void show() {
		System.out.println(x+" "+y);
	}

	static {
		System.out.println("hii");
		System.out.println("byee");
	}
}
public class StaticBlockEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello main");
B b1=new B();
B b2=new B();
b2.x=56;
b1.show();
b2.show();
	}
	
	static {
		System.out.println("Incapp");

	}

}
