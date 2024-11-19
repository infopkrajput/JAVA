interface A1{
	void m();
	
}
interface A2{
	void m();
	
}
class HH implements A1,A2{
	
	public void m() {
		System.out.println("hii cc");
		
	}
}

public class Interfacetoinheritanceex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A1 a=new HH();
a.m();

A2 b=new HH();
b.m();


	}

}
