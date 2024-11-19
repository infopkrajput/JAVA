
public class classobjectq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BB a1=new BB();
a1.x=2;
BB a2=new BB();
a2.y="GGG";
a2.show();
a1.show();

	}

}

class BB{
	int x;
	String y;
	void show() {
		System.out.println(x+y);
	}
}