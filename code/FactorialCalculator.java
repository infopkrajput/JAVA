
public class FactorialCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.Scanner sc = new java.util.Scanner(System.in);

System.out.print("Enter a number: " );
int number = sc.nextInt();
long factorial = calculateFactorial(number);
System.out.println("The factorial of " + number + " is: " + factorial);
sc.close();
	}

	public static long calculateFactorial(int n) {
		long result = 1;
		for (int i = 1; i <=n; i++ ) {
			result *= i;
		}
		return result;
	}
}
	

