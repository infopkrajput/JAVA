
public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Kartik";
String s2=new String("Kartik");
String s3="Kartik";
String s4=new String("Kartik");
String s5="Kartik";
String s6=new String("Kartik");
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
System.out.println(s5);
System.out.println(s6);
System.out.println(s1==s3);//(==)compare the memory refernce
System.out.println(s1==s2);
System.out.println(s2==s4);

System.out.println(s1.equals(s3));
System.out.println(s2.equals(s4));

	}

}
