import java.util.*;
public class ch4Cb {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(n %2==0)
        {
            System.out.println("Given Number is even.");
        }
        else
        {
            System.out.println("Given Number is odd.");
        }
    }
}
