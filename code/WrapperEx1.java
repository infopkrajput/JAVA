
public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Integer obj=new Integer(33);//boxing
		Integer obj=33;//Autoboxing
	//	int a=obj.intValue();//unboxing//optional
		int a=obj;//Autounboxing
		
		System.out.println(obj);
		System.out.println(a);
		
		Byte b=10;
		byte c=b;
		
		double x=77.88;
		Double dd=x;
		System.out.println(x);
		System.out.println(dd);
		
		
	}

}
