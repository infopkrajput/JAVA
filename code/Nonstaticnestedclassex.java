class A{
	int x=12;
	static int y=15;
	private int z=19;
	
	void m() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(B.q);
		B b=new B();
		System.out.println(b.p);
		System.out.println(b.q);
		System.out.println(b.r);
		
	}
	

class B{
	int p=13;
	static int q=17;
	private int r=78;
	
	void m1() {
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
}
public class Nonstaticnestedclassex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//B b=new B();//error	}
		A a=new A();
		System.out.println(a.x);
		System.out.println(a.y);
		a.m();
	//	System.out.println(a.p);//error
		A.B b=a.new B();
		
		System.out.println(b.q);
		System.out.println(b.p);
	//	System.out.println(b.r);//error
		
		b.m1();
		//System.out.println(b.x);//error
	}
}
		


