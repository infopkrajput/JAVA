
public class Triangle extends Shape {
	
	double b=45,h=67;
	
	double area;
	
	void findArea() {
		area=(b*h)/2;
	}
	
	void printArea() {
		System.out.println("Area of Traingle "+area);
	}
}
