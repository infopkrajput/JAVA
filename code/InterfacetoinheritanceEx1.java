interface Human{
	void eat();
	
}
interface Child extends Human{
	void study();
}

class Student implements Child{
	
	public void eat() {
		System.out.println("Hii Student");
		
	}
 public void study() {
	 System.out.println("Hello student");
	 
 }
 
 void Kuchbhi() {
	 System.out.println("bdfjhbj");
 }
 }
public class InterfacetoinheritanceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student();
s1.eat();
s1.study();
s1.Kuchbhi();

Child c1=new Student();
c1.eat();
c1.study();
//c1.Kuchbhi();//error

Human h1=new Student();
h1.eat();
//h1.study();//error
//h1.Kuchbhi();//error
	}
}
	