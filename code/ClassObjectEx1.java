class Stud{
	String name;
	int rollno;
	int age;
	
}
public class ClassObjectEx1 {
public static void main (String[] args) {
	
	Stud s1=new Stud();
	Stud s2=new Stud();
	Stud s3=new Stud();

	
	s1.name="Motilaal";
	s1.age=56;
	s1.rollno=101;
	
	s2.name="Heeralaal";
	s2.age=96;
	s2.rollno=102;
	
	s3.name="Cheetahkhan";
	s3.age=6;
	s3.rollno=119;
	
	System.out.println(s1.name+" "+s1.age+" "+s1.rollno);
	System.out.println(s2.name+" "+s2.age+" "+s2.rollno);
	System.out.println(s3.name+" "+s3.age+" "+s3.rollno);
}
}
			
			
