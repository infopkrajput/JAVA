
public class Ex1 {

	public class IfElseifEx1 {
		public static void main(String[] args) {

			java.util.Scanner sc = new java.util.Scanner(System.in);

			System.out.println("enter your age!");
			int age = sc.nextInt();
			if (age <= 0 || age > 120) {
				System.out.println("enter valid age");
			} else if (age <= 5) {
				System.out.println("you are Kid!!");
			}
			else if (age <= 12) {
				System.out.println("you are children!!");
			}
			else if (age <= 19) {
				System.out.println("you are teenager!!");
			}
			else if (age <= 60) {
				System.out.println("you are adult!!");
			}
			else if (age <= 90) {
				System.out.println("you are Old age!!");
			}
			else {
				System.out.println("you are very old age!!");
			}

			System.out.println("byee ");
			sc.close();
		}
	}
}
