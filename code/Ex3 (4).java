
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc =new java.util.Scanner( System.in);
		String s;
		System.out.println("Hello user");
		do {
			System.out.println("Enter first number");
			int n1=sc.nextInt();
			System.out.println("Enter Second number");
			int n2=sc.nextInt();
			System.out.println("Sum of "+n1 +" and "+n2 +" is "+(n1+n2));
			
			System.out.println("Enter yes to continue");
			s=sc.next();
		}while(s.equalsIgnoreCase("yes"));
		
		System.out.println("byee user");
		sc.close();
	}
}