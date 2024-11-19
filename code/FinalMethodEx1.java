class r{
	final void m() {
			System.out.println("Hii P");
			
}
	final static void m1() {
		System.out.println("hello P");
		
	}
	void m2() {
		System.out.println("P");
	}
	}
class t extends r{
	// void m(); // error can't override final method}
//	static void m1() {//error - can't hide final method
  void m2() {
	  m();
	  m1();
	  System.out.println("Q");
  }
}
	  
  
public class FinalMethodEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
t t1=new t();
t1.m();
t1.m1();
t1.m2();
r r1=new t();
r1.m();
r1.m1();
r1.m2();
	}

}
