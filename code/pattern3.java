public class pattern3{
	public static void main(String[] args) {
		int row=5;
		int col=row;
		for(int j=1;j<=row;j++) {
			for(int i=1;i<=col;i++) {
				System.out.print("*");
			}
			col--;
			System.out.println();
		}
		
	}
}

