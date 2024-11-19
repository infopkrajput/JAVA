//A LinkedHashMap in Java is a subclass of HashMap
//Key Features of LinkedHashMap:
//Maintains Order: Unlike HashMap, which does not guarantee any specific order of the entries, LinkedHashMap maintains the order of insertion. If configured to use access-order, it maintains the order of access.
//Performance: Similar to HashMap, the LinkedHashMap provides O(1) time complexity for basic operations like get and put.
//Null Values and Keys: Like HashMap, LinkedHashMap also allows one null key and multiple null values.


import java.util.*;
public class CollectionEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap h=new LinkedHashMap();

//h.put("a",12);
h.put("b",18);
h.put("ff",45);
h.put(9,"kk");

System.out.println(h);

Set s=h.entrySet();

Iterator i=s.iterator();

while(i.hasNext()) {
	System.out.println(i.hasNext());
}
	}
}
