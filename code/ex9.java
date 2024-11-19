
public class ex9 {

	static void m(int a,int b) {
		System.out.println("hii");
		System.out.println("hello");
		if(a==b) {
			return;
		}
		System.out.println("byee");
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
m(12,77);
m(22,22);

	}

	static String mmm(int a) {
		
		String s=a>=0?"+ve":"-ve";
		return s;
	}
}
