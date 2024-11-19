class KKK{
	final static private int x;
	int y=15;
	void m() {
		System.out.println(x+" "+y);
	}
	KKK(){
		System.out.println("hii");
	}
	{
		System.out.println("hello");
	}
	
	static {
		x=66;
		System.out.println("hii");
	}
}
public class FinalVarques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(KKK.x);
		new KKK().m();
		System.out.println(new KKK().y);
	}
}