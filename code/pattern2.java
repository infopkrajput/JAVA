public class pattern2 {
	public static void main(String[] args) {
		int row=5;
		int col=1;
		int space=row-1;
		for(int j=1;j<=row;j++) {
			
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			for(int i=1;i<=col;i++) {
				System.out.print("*");
			}
			col++;
			space--;
			System.out.println();
		}
		
	}
}