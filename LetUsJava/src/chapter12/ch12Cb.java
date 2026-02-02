//Write a program to reverse the strings stored in the following array:
//    String s[] = {
//            "To err is human...",
//            "But to really mess things up...",
//            "One needs to know Java!!"
//    };

package chapter12;

public class ch12Cb {
    static void main() {
        String[] s = {
                "To err is human...",
                "But to really mess things up...",
                "One needs to know Java!!"
        };
        for (String string : s) {
            String reversed = new StringBuilder(string).reverse().toString();
            System.out.println(reversed);
        }
    }

}
