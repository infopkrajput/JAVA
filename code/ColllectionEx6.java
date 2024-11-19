import java.util.*;

public class ColllectionEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a=new ArrayList(50);//by default 10
a.add(12);
a.add((Integer)45);
a.add(3.4);
a.add(12);
a.add("Mohan");
a.add(88);

Integer a1=(Integer)a.get(3);
System.out.println(a.get(3));
System.out.println(a.get(3));

for(int i=0;i<a.size();i++) {
	System.out.println(a.get(i));
}
System.out.println("--------");
//access in reverse order
for(int i=a.size()-1;i>=0;i--) {
	System.out.println(a.get(i));
}
System.out.println("-------");
for(Object o:a) {
	System.out.println(o);
}
System.out.println("------");
Iterator i=a.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
System.out.println("-----");
ListIterator l=a.listIterator();//subinterface of iterator works only with list
while(l.hasNext()){
System.out.println(l.next());
	}
	//System.out.println(l.next());
	//System.out.println(l.next());
//	System.out.println(l.next());
//	System.out.println(l.next());
//	System.out.println(l.next());
//	System.out.println(l.next());
	//System.out.println(l.previous());
//	System.out.println(l.previous());
//	System.out.println(l.previous());
	//System.out.println(l.previous());
//	System.out.println(l.previous());
//	System.out.println(l.previous());
	
}
}
