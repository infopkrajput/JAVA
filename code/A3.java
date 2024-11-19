
public class A3 {
		private int x;
		public void show() {
		x++;
		System.out.println(x);
		}
		public static void main(String[] args) {
		A3 a= new A3();
		a.show();
		A3 b= new A3();
		a.show();
		b.show();
		}
		}

