public class pattern1 {
	public static void main(String[] args) {
		int a=1;
		int b=5;
		for(int j=1;j<=b;j++) {
			for(int i=1;i<=a;i++) {
				System.out.print("*");
			}
			a++;
			System.out.println();
		}
		
	}
}