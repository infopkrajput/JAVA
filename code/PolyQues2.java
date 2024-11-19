class Animal{
	int x=12;
	static int y=13;
	void makeSound() {
		System.out.println("Speak");
		
	}

static void m() {
	System.out.println("Hii Animal");
	}
}
class Dog extends Animal{
	String x="gg";
	static int y=45;
	void makeSound() {
		System.out.println("Bark");
	}
	static void m() {
		System.out.println("Hii dog");
	}
	void show() {
		System.out.println("Hello Dog");
	}
}
		
	
public class PolyQues2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal a1=new Dog();
//error a1.show();//error
a1.makeSound();
a1.m();
System.out.println(a1.x);
System.out.println(a1.y);

Dog d1=new Dog();
d1.show();
d1.makeSound();
d1.m();
System.out.println(d1.x);
System.out.println(d1.y);
	}

}
