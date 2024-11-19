import java.util.Scanner;
public class PrimeNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = sc.nextInt();
Boolean isPrime = isPrime(number);

if (isPrime) {
	System.out.println(number + " is a prime number.");
} else {
	System.out.println(number + " is not a prime number.");
}
	sc.close();
}

	public static boolean isPrime(int n){
		if(n <= 1) {
			return false;
		}
		for (int i =2; i <=Math.sqrt(n); i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
}
	