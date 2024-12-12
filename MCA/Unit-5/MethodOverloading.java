public class MethodOverloading extends Parent{
    String display(String a)
    {
        String s = "Strign : " + a; 
        return s;
    }
    void callingDisplay()
    {
        System.out.println(super.display(6));
        
    }
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.display("Hello"));  // Calls display(String a) in Parent class
        System.out.println(obj.display(56));  // Calls display(String a) in Child class
        obj.callingDisplay();  // Calls display(int a) in Parent class
    }
}
