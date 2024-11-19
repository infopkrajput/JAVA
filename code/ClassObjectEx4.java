
public class ClassObjectEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AAA a1=new AAA();
a1.x=10;
a1.m();

AAA a2=new AAA();
a2.y="Mohan";
a2.x=13;
a2.m();
a2.show();
a1.show();
	}

}
class AAA{
	int x;
	String y;
	void m() {
		x=22;
	}
	void show() {
		System.out.println(x+y);
	}
}