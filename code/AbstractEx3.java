abstract class x{
	int x=12;
	static int y=12;
	
	x(){
		System.out.println("hii X");
	}
	
	{
		System.out.println("hello x");
	}
	static { 
		System.out.println("static");
		
	}
}
class y extends x{
	int y=13;
	int z=15;
	static {
		System.out.println("hii y");
	}
	{
		System.out.println("hello y");
		
	}
}
public class AbstractEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x y1=new y();
		System.out.println(y1.x+" "+y1.y);

	}

}
