interface P{
	void m();
	default void xyz() {
		System.out.println("hello xyz");
	}
}

class q{
	public void xyz() {
		System.out.println("Hii xyz");
	}
}
	
class r extends q implements P{
	public void m() {
		xyz();
		
	}
	
}
public class defaultstaticex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
r r1=new r();
r1.m();
	}

}
