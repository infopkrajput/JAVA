interface M{
	int x=14;
	void m1();
}
abstract class N implements M{
	int x=15;
	abstract  void m2();
}
 class o extends N{
	 final int x=66;
	 
	 public void m1() {
		 System.out.println("hii");
		 
	 }
	 void m2() {
		 	System.out.println("hello");
	 }
}
public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
M m1=new o();
	System.out.println(m1.x);
	m1.m1();
//	m1.m2();//error
	
	N n1=new o();
	System.out.println(n1.x);
	n1.m1();
	n1.m2();
	
	
	
	}

}
