
public class BitwiseOprEx {

	public static void main(String[] args) {
		int a=10,b=8;
		
		int c= a&b;	//bitwise and
		System.out.println(c);
		
		c= a|b;	//bitwise or
		System.out.println(c);
		
		c= a^b;	//bitwise xor
		System.out.println(c);
		
		c= a>> 1;// bitwise right shift 
		System.out.println(c);
		
		c=a<<1;//bitwise left shift
		System.out.println(c);
		
		c=~a;//bitwise not
		System.out.println(c);
	}
}
