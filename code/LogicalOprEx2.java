
public class LogicalOprEx2 {
	public static void main(String[] args) {
		int a=12, b=8;
//		boolean c= ++a <= b++ && --b*2<12;
		boolean c= !(++a >= b++ || --b*2<12);
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		
		
		
	}

}
