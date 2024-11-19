import java.io.IOException;
public class ConsoleEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	System.out.println("Enter a character");
	int a=System.in.read();
	char c=(char)a;
	System.out.println("Entered character is :"+c);
	
	System.out.write(65);
	System.out.flush();
}catch(IOException e){
	System.out.println(e);
	
	
	
}
	}

}
