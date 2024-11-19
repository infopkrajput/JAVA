
public class RelationalOprex2 {

	public static void main(String[] args) {
		int a= 12,b=6;
		
		
		boolean c=a<b;
		
		System.out.println(c);
		
		c=a>b;
		System.out.println(c);
		
		b*=2;
		c=a!=b;
		System.out.println(c);
		
		System.out.println(a==b);
		
		c = a++ <=b++;
		System.out.println(c);
		
		a=12;
		b=12;
		c = --a >=--b;
		System.out.println(c);
		
		
	}
}