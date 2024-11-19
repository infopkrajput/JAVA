class Mobile{
	String storage;
	String battery;
	String company;
}
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile m1=new Mobile();
Mobile m2=new Mobile();
Mobile m3=new Mobile();

m1.storage="250gb";
m1.battery="50%";
m1.company="Lava";

m2.storage="129gb";
m2.battery="90%";
m2.company="Samsung";

m3.storage="36gb";
m3.battery="10%";
m3.company="apple";

System.out.println(m1.storage+" "+m1.battery+" "+m1.company+" ");
System.out.println(m2.storage+" "+m2.battery+" "+m2.company+" ");
System.out.println(m3.storage+" "+m3.battery+" "+m3.company+" ");
	}

}
