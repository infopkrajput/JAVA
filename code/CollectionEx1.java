import java.util.*;

public class CollectionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Set h=new HashSet();
HashSet h=new HashSet();//stores object randomly
//ArrayList h=new ArrayList();

h.add("ram");
h.add(8);
h.add(8);//dont add again
h.add(9.7);
h.add("xyz");
h.add(99);

System.out.println(h);
//System.out.println(h.get(4));
h.remove(2);
System.out.println(h);

for(Object o:h) {
	System.out.println(o);
}
	}
}

