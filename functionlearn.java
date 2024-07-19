import java.util.*;

public class functionlearn {
    public static void reverse(int num[]){
        int temp;
        for(int i =0;i<num.length/2;i++){
            temp = num[i];
            num[i] = num[num.length-1-i];
            num[num.length-1-i] = temp;
        }
    }

    public static void main(String[] args) {
        int num[] = {2,4,5,6,8,10};
        reverse(num);
        for(int i = 0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
