package Unit5;

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
    public static void main(String[] args){
        System.out.println("MethodOverloading example");
    }
}
