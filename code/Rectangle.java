
public class Rectangle extends Shape {
	
	double l=23 ,b=34;
	
	double area;
	
	void findArea() {
		area=l*b;
	}
	
	void printArea() {
		System.out.println("Area of Rectangle "+area);
	}
}
	