
public class NestedIfelse1 {

public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("enter your age!");
		int age=sc.nextInt();
		if(age<=0 ||  age>120) {
			System.out.println("enter valid age");
		}
		else {

			if(age>=18) {
				System.out.println("you are adult!!");
			}
			else {
				System.out.println("You are not adult!!");
			}
		}
		
		System.out.println("byee ");
		sc.close();
	}

}