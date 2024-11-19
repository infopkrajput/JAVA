class AAA{
	int x=10;
	static int y=13;
	private double z=12;
	
	void M2() {
		//B b1=new B();//error
	}
	void m() {
		int j=19;
		int k=5;
	//	B b1=new B();//error
		
		class B{
			int p=16;
			static int y=77;
			void m1() {
				System.out.println("From B");
				System.out.println(j);
				System.out.println(k);
				
			
		}
	}
	B b1=new B();
	System.out.println(b1.p);
	System.out.println(b1.y);
	b1.m1();
	}
	
}
public class LocalNestedClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//B b=new B();//error
AAA a1=new AAA();
//AAA.B b2=a1.new B();//error
a1.m();
}
}


