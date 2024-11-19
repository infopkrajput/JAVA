class Person{
	String name;
	int age;
	double height;

	void show() {
		System.out.println(name+" "+age+" "+height);
	}

	
	Person(){
		System.out.println("Hii");
	}
	{
		System.out.println("hello");
		
	}
	{
		System.out.println("Ok");
	
	}
}


public class initializeblockex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p1 = new Person();
Person p2 = new Person();
Person p3 = new Person();
p1.show();
p2.show();
p3.show();
}
}


