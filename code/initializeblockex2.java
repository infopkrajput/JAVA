class Animal{
	String name;
	int age;
	
	Animal(){
		System.out.println("Hii");
	}
	Animal(String a){
		name =a;
		System.out.println("name variable initialized..");
		
	}

Animal(String a,int b){
	name=a;
	age=b;
	System.out.println("name and age variable initialized..");
	
}
{
	System.out.println("Hello");
	System.out.println("Initialise Block!!");
}
}

public class initializeblockex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal h1=new Animal("John");
Animal h2=new Animal();
Animal h3=new Animal("KK",13);
	}
}
