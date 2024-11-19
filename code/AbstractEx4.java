abstract class XX{
	abstract int m();
	static void m2() {
		System.out.println("hello");
		}
	}
class YY extends XX{
	int k=88;
	int m() {
		System.out.println("Hii");
		return 6;
	}
	static void m2() {
		System.out.println("hello YY");
	}
}
public class AbstractEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
XX x1=new YY();
x1.m2();
x1.m();
	}
}