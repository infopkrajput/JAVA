import java.util.*;
public class CollectionEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList l=new LinkedList();

l.addFirst(12);
l.addFirst(72);
l.addFirst("jj");
l.addFirst(1.2);

System.out.println(l);

l.addLast(88);
l.addLast("Rohan");

System.out.println(l);

Iterator i=l.iterator();

while(i.hasNext()) {
	System.out.println(i.next());
}
	}
}
