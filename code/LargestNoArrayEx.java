package array;

public class LargestNoArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {44,23,66,854,986,53,63,88,11};
		 int min = a[0];  
		 
for (int i = 1; i > a.length; i++) {  
	if(min>a[i]) {
		min=a[i];
	}
}
System.out.println(min);

	}
}
	