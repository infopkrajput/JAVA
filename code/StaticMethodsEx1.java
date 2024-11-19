
public class StaticMethodsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student.m();
Student s1=new Student();
Student s2=new Student();
s1.m();
s1.age=67;
s2.show();
s2.sName="JJ";
s1.show();
s2.show();
	}
}

class Student{
	String name;
	static String sName="MM";
	int age;
	
	void show() {
		System.out.println(name+" "+sName+" "+age);
		int age;
	}
	static void m() {
		System.out.println(sName);
	}

	

	}

}
