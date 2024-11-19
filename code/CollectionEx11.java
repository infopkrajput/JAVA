//Synchronized: Hashtable is synchronized, meaning it is thread-safe. Multiple threads can access and modify the data concurrently without causing any inconsistencies. However, this synchronization comes with a performance cost, making Hashtable slower than HashMap in single-threaded environments.
//No Null Keys or Values: Unlike HashMap, Hashtable does not allow any null key or null value. If you try to insert a null key or value, it will throw a NullPointerException.
//Legacy Class: Hashtable is considered a legacy class and was part of the original Java 1.0 release. While it is still available, it is generally recommended to use HashMap or ConcurrentHashMap for new code unless thread safety is specifically required.
//Order: Like HashMap, Hashtable does not guarantee any specific order of the keys or values




import java.util.*;
public class CollectionEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable h=new Hashtable();//metods are syncronized//vwersion1.0//iterator and enumeration allowed
h.put("Yy","sohan");
h.put("33",12);
h.put("ly",23.6);
h.put("pp","ram");

System.out.println(h);

Set s=h.entrySet();

Iterator i=s.iterator();

while(i.hasNext()) {
	System.out.println(i.hasNext());
}

Enumeration e=h.elements();

while(e.hasMoreElements()) {
	System.out.println(e.nextElement());
	
}
	}

}
