//Sorted Order: The entries in a TreeMap are sorted by the keys in ascending order.
//NavigableMap Interface: TreeMap implements the NavigableMap interface, providing methods to navigate the map in different ways, such as retrieving keys or entries that are greater than, less than, or equal to a specified value.
//Red-Black Tree: Internally, TreeMap is implemented using a Red-Black tree, which ensures that the map operations like get, put, remove, etc., have a time complexity of O(log n).
//Null Values: TreeMap allows null values but does not allow null keys, as the keys need to be comparable to maintain order.





import java.util.*;
public class CollectionEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap t=new TreeMap();

t.put("abc",13);
t.put("mno",77);
t.put("def",8);
//t.put(3, 13);//classcast Exception
t.put("ghi","karan");
System.out.println(t);

Set s=t.entrySet();

Iterator i=s.iterator();
while(i.hasNext()) {
	System.out.println(i.hasNext());
	
}

TreeMap t2=new TreeMap();

t2.put(12, 13);
t2.put(44, 77);
t2.put(1, 8);
t2.put("kk", 13);//classcast exception
t2.put(14,"Karan");
System.out.println(t);

Set s2=t2.entrySet();

Iterator i2=s2.iterator();

while(i2.hasNext()) {
	System.out.println(i2.next());
}

	}

}

