
public class LbLoopex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		outerloop:
			for(int i=1;i<=5;i++) {
				System.out.println("Hii");
				
			for(int j=1;i<=5;j++) {
				System.out.println(j);
				if(j==3) {
					break outerloop;
					
				}
			}
			
			System.out.println("byee");
			}
	}

}
