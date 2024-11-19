
public class Nestedifelse2 {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("enter your age!");
		int age = sc.nextInt();
		if (age <= 0 || age > 120) {
			System.out.println("enter valid age");
		} else {

			if (age > 0 && age <= 5) {
				System.out.println("you are Kid!!");
			}
			if (age > 5 && age <= 12) {
				System.out.println("you are children!!");
			}
			if (age > 12 && age <= 19) {
				System.out.println("you are teenager!!");
			}
			if (age > 19 && age <= 60) {
				System.out.println("you are adult!!");
			}
			if (age > 60 && age <= 90) {
				System.out.println("you are Old age!!");
			}
			if (age > 90 && age <= 120) {
				System.out.println("you are very old age!!");
			}

		}

		System.out.println("byee ");
		sc.close();
	}

}