package array;

public class ArraysEx1 {
	public static void main(String[] args) {
//		int arr[6];//error
//		 int []arr;//allowed
		int arr[];//array declaration
		
		arr=new int[5];//array creation
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		arr[0]=12;//array initialization
		arr[1]=22;//array initialization
		arr[2]=72;//array initialization
		arr[3]=11;//array initialization
		arr[4]=66;//array initialization
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		
		System.out.println(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	
		System.out.println("---------------------");
		
		for(int x:arr) {
			System.out.println(x);
		}
		
	}
}