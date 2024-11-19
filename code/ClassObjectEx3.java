class Employee{
	private String name;
	private String cname;
	private int salary;
	
	public void show() {
		System.out.println(name+" "+salary+" "+cname);
	}
	void input(String n,String c,int s) {
		name=n;
		cname=c;
		salary=s;
	}
	
	
}
public class ClassObjectEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1= new Employee();
e1.show();
e1.input("Rohit","abc", 120);
e1.show();
	}

}
