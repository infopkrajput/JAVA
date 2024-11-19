final class ww{
	int x=13;
	void m() {
		System.out.println("hii");
		
	}
}
//class B extends A{//error
class Q{
	void m() {
		System.out.println("Hello");
		
	}
}
public class FinalClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ww w1=new ww();
w1.m();
System.out.println(w1.x);

Q b1=new Q();
//System.out.println(b1.x);//error
b1.m();
	}

}
