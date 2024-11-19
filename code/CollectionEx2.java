import java.util.*;

public class CollectionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet a=new LinkedHashSet();
//HashSet a=new HashSet();

a.add(77);
a.add(77);
a.add("Karan");
a.add('k');
a.add(66);
a.add("joy");

System.out.println(a);

a.remove(77);//remove a/c object
a.remove((Integer)77);//allowed
System.out.println(a);


//a.remove(77);//remove a/c object
a.remove((Integer)77);//allowed
System.out.println(a);
	}

}
