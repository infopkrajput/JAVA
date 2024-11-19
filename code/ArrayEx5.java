package array;

public class ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {34,56,65};

for(int i=arr.length-1;i>=0;i--) {
System.out.println(arr[i]);
}

int sum=0;
//for(int i=0;i<arr.lenght;i++) {
//	sum==arr[i];
//}

for(int x:arr){
	sum+=x;
}
System.out.println("Sum :"+sum);
	}
}




