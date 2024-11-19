
public class FibonacciSequenceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
int n1=0;
int n2=1;
if(n==0) {
	System.out.println("Please enter vale more than 0");
}
else if(n==1) {
	System.out.println(n1+" "+n2);
}else {
	System.out.println(n1+" "+n2+" ");
	int count =2;
	while(count<n) {
		int t=n1+n2;
		System.out.println(t+" ");
		n1=n2;
		n2=t;
		count++;
	}
}
	}
}

	