class Stud1{
	String name;
	int rollNo;
	int age;
	
	void show() {
		System.out.println(name+" "+age+" "+rollNo);
	}
	
	void input(String a,int b,int c) {
		name=a;
		rollNo=b;
		age=c;
	}
}
public class ClassObjectEx2 {
	public static void main(String[] args) {
		
		Stud1 s1=new Stud1();
		Stud1 s2=new Stud1();
		Stud1 s3=new Stud1();
		Stud1 s4=new Stud1();
		s1.show();
		s2.show();
		s3.show();
		s4.show();
		s1.input("Chajjulaal", 101, 100);
		s2.input("Mohan", 102, 10);
		s3.input("Sohan", 103, 19);
		s4.input("Jaadu", 104, 67);
		s1.show();
		s2.show();
		s3.show();
		s4.show();
		
		System.out.println(s1.name+s1.age+s1.rollNo);
		
	}
}
