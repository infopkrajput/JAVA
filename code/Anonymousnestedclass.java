class Abc{
	void m1() {
		System.out.println("Hello ABC");
		
	}
	void m2() {
		System.out.println("Hi ABC");
		
	}
}
interface Xyz{
	void m();
	void mm();
}
public class Anonymousnestedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//class Pqr extends Abc{
	//void m1() {
		//System.out.println("Hello Pqr");
		
	//}
	//void m2() {
		//System.out.println("Hi Pqr");
	//}
//}
//Abc p1=new Pqr();
//p1.m1();
//p2.m2();
//class Lmn implements Xyz{
	
	//public void m() {
	//	System.out.println("hello LMN");
	//}
	//public void mm() {
		//System.out.println("hii Lmn");
		
//	}
//}

//Xyz l1=new Lmn();
//l1.m();
//l1.mm();

Abc a1=new Abc() {
void m1() {
	System.out.println("m1 overrided");
	
}
void m2() {
	System.out.println("m2 overrided");
}
void m3() {
	System.out.println("m2 overrided");
}
	};
	a1.m1();
	a1.m2();
//	a1.m3();
	
	Xyz x1=new Xyz() {
		public void m() {
			System.out.println("Hiii");
		}
			
			public void mm() {
				System.out.println("Hello");
			}
		};
			x1.m();
			x1.mm();
			
	}
}
	
	
	
