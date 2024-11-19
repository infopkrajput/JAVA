interface Human{
	default void eat() {
			System.out.println("hello");
			m2();
			
	
}
	static void mm() {
		System.out.println("Heyy");
		
	}
	private void m2() {
		System.out.println("Hii human");
	}
}
	class Animal{
		public void eat() {
			System.out.println("HII");
		}
	}
			
	class c extends Animal implements Human{
		
		void print() {
			eat();
//		mm();//error
			Human.mm();
		}
	}
			
public class defaultStaticMethodEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
c c1=new c();
c1.print();
	}
}
	