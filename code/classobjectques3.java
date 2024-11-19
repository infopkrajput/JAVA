
public class classobjectques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ss a1=new ss();
a1.x=10;
a1.m();

ss a2=new ss();
a2.y="Mohan";
a2.x=13;
a2.m();
a2.show();
a1.show();

	}

}

class ss{
	int x;
	String y;
	void m() {
		x=22;
	}
	void show() {
		System.out.println(x+y);
	}
}