import java.util.*;
public class CollectionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet t=new TreeSet();

t.add(12);
t.add(55);
t.add(9);

//t.add("KK");//classcasteexception
t.add(3);

System.out.println(t);

for(Object a:t) {
	System.out.println(a);
}

t=new TreeSet();
t.add("abc");
t.add("pqr");
t.add("mno");
t.add("def");

System.out.println(t);

for (Object a:t) {
	System.out.println(a);
}
}

}
