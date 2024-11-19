class Student{
	String name;
	int rollNo;
	int age;
}


public class Practice2 {
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
//		System.out.println(s1.name);
//		System.out.println(s1.age);
//		System.out.println(s1.rollNo);
		
		System.out.println(s1.name+" "+s1.age+" "+s1.rollNo);
		System.out.println(s2.name+" "+s2.age+" "+s2.rollNo);
		System.out.println(s3.name+" "+s3.age+" "+s3.rollNo);
		
		s1.name="Motilaal";
		s1.age=56;
		s1.rollNo=101;
		
		s2.name="Heeralaal";
		s2.age=96;
		s2.rollNo=102;
		
		s3.name="Cheetahkhan";
		s3.age=6;
		s3.rollNo=119;
		
		System.out.println(s1.name+" "+s1.age+" "+s1.rollNo);
		System.out.println(s2.name+" "+s2.age+" "+s2.rollNo);
		System.out.println(s3.name+" "+s3.age+" "+s3.rollNo);
	}
}