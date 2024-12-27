public class unit1_2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        // Post fix increment
        System.out.println("Demonstrate post fix increment : ");
        System.out.println("a = " + a);
        System.out.println("Post fix increment : " + a++);// This will print only 5 (Post fix increment)
        System.out.println(a); // This will print 6 because a already incremented

        // pre fix increment
        System.out.println("Demonstrate pre fix increment : ");
        System.out.println("b = " + b);
        System.out.println("Pre increment : " + ++b); // This will print 7  because (pre increment)
        System.out.println(b); // This will print 7  because b already incremented

        // same for decrement
        int c = 5;
        int d = 6;
        System.out.println("Demonstrate post fix decrement : ");
        System.out.println("c = "+c);
        System.out.println("Post fix decrement : " + c--); // This will print only 5 (Post fix decrement)
        System.out.println(c); // This will print 6 because a already incremented

        System.out.println("Demonstrate pre fix decrement : ");
        System.out.println("d = " + d);
        System.out.println("Prefix decrement : " + --d); // This will print 5  because (pre decrement)
        System.out.println(b); // This will print 5  because b already decremented

        // if else
        int e = 5;
        if(e > 10){
            System.out.println(e + " Is greater than 10.");
        }
        else {
            System.out.println(e + " Is less than 10.");
        }
        System.out.println("Print and decrement e until it become 1.");
        while (e >= 1){
            System.out.println(e--);
        }

    }
}
