
public class Q4 {
static int x;
int y;
void m(int a) {
	y=a;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Q4.x);
Q4 a=new Q4();
a.m(4);
a.x=3;
System.out.println(Q4.x);
System.out.println(a.y);
System.out.println(a.x);
	}

}
