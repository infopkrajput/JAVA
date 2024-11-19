package array;

public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr=new int[] {23,45,75,34,44};
System.out.println(arr[4]);
m1(arr);//call or pass by reference
System.out.println(arr[4]);

System.out.println(arr[4]);
m2(arr[4]);//call or pass by value
System.out.println(arr[4]);
	}
	static void m1(int b[]) {
		b[4]=54;
	}
	
	static void m2(int a) {
		a=34;
	}
}
	