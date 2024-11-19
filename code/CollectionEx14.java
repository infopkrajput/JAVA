//Allows null elements.
import java.util.*;
public class CollectionEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {12,32,122,22,34,64,34,54};
ArrayList l=new ArrayList();

for(int x:a) {
	l.add(x);

}

System.out.println(l);

int b[]=new int[l.size()];
int i=0;
for(Object x:a) {
	b[i]=(Integer)x;
	i++;
}

System.out.println(Arrays.toString(b));
	}
}

	