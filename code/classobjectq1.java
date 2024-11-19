
public class classobjectq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AA a1=new AA();
AA a2=new AA();
a1.show();
a1.x=23;
a2.show();
System.out.println(a1.x);
System.out.println(a2.x);
	}
}

class AA{
	int x;
	void show() {
		System.out.println(x);
	}
}

