import java.util.*;

public class CollectionEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet h=new HashSet();

h.add(872);
h.add("KK");
h.add(99);
h.add(9.5);
h.add(63);

System.out.println(h);
System.out.println(h.size());

for(Object o:h) {
	System.out.println(o);
//h.remove(o);ConcurrentModificationException
}

Iterator i=h.iterator();

//System.out.println(i.next());
//System.out.println(i.next());
//System.out.println(i.next());
//System.out.println(i.next());
//System.out.println(i.next());

System.out.println(i.next());//NoSuchElementException

while(i.hasNext()) {
	System.out.println(i.next());
	i.remove();
}
	System.out.println(h);
	System.out.println(h.isEmpty());
	}
}
