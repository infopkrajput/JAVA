
public class ExceptionhandlingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello");
int a=12,b=0,c=0;
try {
	c=a/b;
	System.out.println("Division :"+c);
}catch(ArithmeticException e) {
	System.out.println("Number can not be divide by zero");
}
System.out.println("Byee");
	}
}
	
