
public class A4 {
		int p=1;
		public void m(int x) {
		p=x;
		}
		public static void main(String[] args) {
		A4 d= new A4();
		d.p=3;
		System.out.println(d.p);
		d.m(4);
		System.out.println(d.p);
		}
}