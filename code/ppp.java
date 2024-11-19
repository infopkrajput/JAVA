
public class ppp {
	int x=10;
	static String y="Ram";
	void show() {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ppp a1=new ppp();
a1.x=20; a1.y="Xyz";
ppp a2=new ppp();
a2.x=40; a2.y="Yoyo";
a1.show();
a2.show();

	}

}
