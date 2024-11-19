class K{
	final int x=14;
	int y=15;
	void m() {
			System.out.println(x+" "+y);
			
	}
}

public class FinalVarques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
K k1=new K();
k1.m();
k1.y=16;
//K1.x=17;//error
	}

}
