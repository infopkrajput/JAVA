//Key Features of HashMap:
//No Duplicate Keys: Each key in a HashMap is unique. If you try to insert a duplicate key, the previous value associated with that key will be replaced.
//Null Values: HashMap allows storing null as a key or value. However, only one null key is allowed.
//Order: HashMap does not maintain any order of the keys or values. The order of elements is not guaranteed to remain constant over time.
//Performance: HashMap provides constant-time complexity (O(1)) for basic operations like getting and putting data, assuming the hash function disperses elements properly among the buckets.



import java.util.*;
public class CollectionEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap h=new HashMap();

h.put("abc",13);
h.put("def", 3.5);
h.put("ghi",3.5);
h.put(6,"Mohan");
h.put("jkl","rohan");
h.put("jkl","mohan");
h.put("mno",377);
h.put("pqr",'j');

System.out.println(h);
System.out.println(h.get("mno"));

Set s=h.entrySet();

Iterator i=s.iterator();

while(i.hasNext()) {
	System.out.println(i.next());
}

for(Object o:s) {
	System.out.println(o);
}

Set s2=h.keySet();

Iterator i2=s2.iterator();

while(i2.hasNext()) {
	System.out.println(i2.next());
}

Set s3=h.keySet();

Iterator i3=s3.iterator();

while(i3.hasNext()) {
	System.out.println(h.get(i3.next()));
}
	}
}












