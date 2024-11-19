
public class ScannerEx1 {

public static void main(String[] args) {
		
		java.util.Scanner ss =new java.util.Scanner(System.in);
		
		
		System.out.println("enter two numbers:");
		
		int n1=ss.nextInt();
		
		int n2=ss.nextInt();
		
		int c=n1+n2;
		
	System.out.println("Sum of "+n1+ " and "+n2+" is = " +c);
	
	ss.close();
	}
}
