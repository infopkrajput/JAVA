class KK{
	final int x;
	int y=15;
	void m() {
		System.out.println(x+" "+y);
	}
	KK(){
		x=17;
	}
	{
		// x=18;
		
	}
}

public class FinalVarques2{
	public static void main (String[] args){
		KK k1=new KK();
		k1.m();
	}
}
	