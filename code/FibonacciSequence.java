import java.util.Scanner;
public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of terms in the Fibonacci sequence: ");
int numTerms = sc.nextInt();
sc.close();

System.out.print("Fibonacci sequence up to " + numTerms + " terms:");
for (int i=0; i < numTerms; i++) {
	System.out.print(fibonacci(i) + " ");
}
	}
	public static int fibonacci(int n) {
		if (n<= 1) {
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
}

