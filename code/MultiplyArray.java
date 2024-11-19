package array;

public class MultiplyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {12,17,77,54,44};
//for(int i=arr.length-1;i>=0;i--) {
//	System.out.println(arr[i]);
	
	
//}
//for(int x:arr) {
	int multiply=1;
	for(int i=1;i<arr.length;i++) {
		multiply=multiply*arr[i];
	}
	
System.out.println("Multiply:"+multiply);
}
}
	