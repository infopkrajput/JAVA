public class Main {
    public static void display(String name, int salary){
        System.out.println("Name of employee is: " + name);
        System.out.println("Salary of employee is: " + salary);
    }
    public static void main(String argvs[]){
        Main mainMeth = new Main();
        mainMeth.display("Bibhuti",50000);

    }
}
