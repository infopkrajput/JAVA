
public class IntegerLitEx {
	public static void main(String[] args) {
        int a=104;//Decimal Integer Literal
        int b=0150;//Octal Integer Literal
        // int c=0X6e;//allowed
        int c=0x68;//Hexa Integer Literal
        // int d=0B1101000;//allowed
        int d=0b1101000;//Binary Integer literal
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int e=1__5__6;
        // int e=_1__5__6_;//error
        System.out.println(e);
        // int f=_0__1__5__3;//error
        int f=0__1__5__3;
        System.out.println(f);

        // int g=0_x_465e;//error
        int g=0x7__5_4;
        System.out.println(g);

        // int h=0_b_11001001;//error
        int h=0b11__001001;
        System.out.println(h);
    }
}
}
