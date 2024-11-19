
public class Ex3 {

	public static void main(String[] args) {
		
		System.out.println(10);//integer data is int-by default 
		System.out.println(12.65);//floating data is double-by default
		
//		float f=14.65f;//allowed
//		float f=14.65F;//allowed
		float f=(float)14.65;
		System.out.println(f);
		
		byte b=(byte)15;
		
		short c=36;
		b=(byte)c;
		
		
//		long l=(long)63554373643L;
		long l=63554373643l;
		System.out.println(l);
		
		
	}
}