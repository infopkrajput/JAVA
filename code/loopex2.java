
public class loopex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
outerloop:
	for(int i=1;i<=3;i++){
		System.out.println("Hii");
	
		
innerloop:
			for(int j=1;j<=3;j++) {
				System.out.println("Ram");
				if(j==2) {
					continue outerloop;
				}
				System.out.println("Mohan");
			}
		System.out.println("byee");
				}
			}
}


