class M{
	final private void m() {
		System.out.println("Private method!!");
		
		
	}
}
class N extends M{
	void m() {
		System.out.println("Hello N");
		
	}
}
public class Privatefinalmethodex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
N n1=new N();
n1.m();
M m1=new N();
//m1.m();//error
	}

}
