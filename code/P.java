public class P {
	public static void main(String[] args) {
		W w1=new W();
		w1.m();
		W w2=new W(12);
		w2.m();
	}
}

class W{
	int p;
	void m() {
		System.out.println(++p);
	}
	
	W(){
		this(23,88.66);
	}
	W(int a,double b){
//		this();//error
		this(4);
		System.out.println("Hello");
	}
	W(int v){
		System.out.println("heyy");
	}
}
