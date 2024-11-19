
public class classobjectques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
D a=new D();
a.Foo();
a.x=11;
a.show();

	}

}

class D{
	int x;
	private int y;
	String ss;
	
	void Foo() {
		System.out.println("Heheheh");
		int a=x++ - --y;
		System.out.println(a);
		
	}
	void show() {
		System.out.println(x+ss+y);
	}
}