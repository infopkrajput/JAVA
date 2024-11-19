class FF{
	int x=13;
	final int h=55;
	static String y="gg";
	void m() {
		System.out.println(x+y);
	}
	
	{
		System.out.println("hii ff");
		
	}
	static {
		System.out.println("hello ff");
		
	}
	FF(){
		System.out.println("ff1");
		
	}
}
class GG extends FF{
	int z=56;
	int h=13;
	static {
		System.out.println("hii G");
	}
		void m() {
			++h;
			System.out.println(this.h);
			System.out.println(super.h);
			System.out.println(h++);
		}
	
}
public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FF obj1=new GG();
		obj1.m();
		GG obj2=(GG)obj1;
		obj2.m();
	}

}
