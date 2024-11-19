import java.util.*;
public class ColllectionEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List l1 =new ArrayList();
l1.add(12);
l1.add("hh");
l1.add(34.3);
System.out.println(l1);
Integer ii=(Integer)l1.get(0);

//	ArrayList<Integer> l2=new ArrayList<Integer>();
//	ArrayList<Integer> l2=new ArrayList();
//	ArrayList<Integer> l2=new ArrayList<>();
//	ArrayList l2=new ArrayList<Integer>();//non generic list
	
	List<Integer> l2=new ArrayList<Integer>();
//	ArrayList<> l2=new ArrayList<>();//error
	l2.add(13);
//	l2.add("tt");//error
	l2.add(33);
	l2.add(77);
	l2.add(28);
//	l2.add(45.4);//error

	System.out.println(l2);
	Integer d=l2.get(3);
	for(Integer i:l2) {
		System.out.println(i);
HashMap<String,Integer> h1=new HashMap<>();
		
		h1.put("77", 66);
		h1.put("ab", 6);
		h1.put("cd", 12);
		
		System.out.println(h1);
	}

}
}
