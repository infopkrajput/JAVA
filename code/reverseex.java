
public class reverseex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.Scanner sc=new java.util.Scanner(System.in);

		System.out.println("Enter a number");
int n=sc.nextInt();

while(n>0) {
	int rem=n%10;
	System.out.print(rem);
	n/=10;
}
	}
}


	