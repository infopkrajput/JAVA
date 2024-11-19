class M{
	int x=14;
	int y=16;
	
	class N{
		int x=19;
		int z=77;
		void m() {
			System.out.println(y);
			System.out.println(z);
			System.out.println(M.this.x);
			
		}
	}
}
public class InnerClassShadowingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
M m1=new M	();
M.N n1=m1.new N();
n1.m();
	}
}
