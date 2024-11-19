package array;
import java.util.Scanner;
public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("Enter size of array");
int size=sc.nextInt();//10

int []arr=new int [size];
System.out.println("Enter "+size +" values for array");

for(int i=0;i<size;i++) {
	System.out.println("Enter "+(i+1)+"value of array");
	arr[i]=sc.nextInt();
}
for(int i:arr) {
	System.out.println(i);
}
for(int i=0;i<size;i++) {
	System.out.println((i+1)+"element of array "+arr[i]);
}

sc.close();
}

}
