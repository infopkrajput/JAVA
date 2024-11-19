
public class Emp{
String name;
Emp(){
	System.out.println("Hello Emp");
	name="Rahul";
}
static {
	System.out.println("Hii Emp");
	
}
{
		System.out.println("I am Emp");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp e1= new Emp();
Emp e2= new Emp();
System.out.println(e1.name);
	}

}
