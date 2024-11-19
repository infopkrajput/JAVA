import java.util.*;
public class CollectionEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayList v=new ArrayList();
Vector v=new Vector(80,20);

v.add(10);
v.add("kk");
v.add(8.66);
v.add(55);
v.add(2);

System.out.println(v);
for(int i=0;i<v.size();i++) {
	System.out.println(v.get(i));
}

//v.remove(2);
System.out.println(v);
v.remove((Integer)2);
System.out.println(v);
Iterator i=v.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
Enumeration e=v.elements();
while(e.hasMoreElements()) {
	System.out.println(e.nextElement());
}
	}
}
