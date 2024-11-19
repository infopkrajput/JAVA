public class Q1{ 
 static int x; 
 void m() { 
  x++; 
  System.out.println(x); 
 } 
 static void setX(int a) { 
  x=a; 
 }
 
public static void main(String[] args) { 
	  Q1 a= new Q1(); 
	  System.out.println(a.x); 
	  a.m(); 
	  Q1.setX(15); 
	  a.m(); 
	 } 
	} 

