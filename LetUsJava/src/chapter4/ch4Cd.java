import java.util.*;

public class ch4Cd {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age of Ram : ");
        int ram = sc.nextInt();
        System.out.print("Enter the Age of Shyam : ");
        int shyam = sc.nextInt();
        System.out.print("Enter the Age of Ajay : ");
        int ajay = sc.nextInt();
        if (ram < shyam) {
            if (ram < ajay) {
                System.out.println("Ram is youngest.");
            } else {
                System.out.println("Ajay is youngest.");
            }
        } else {
            if (shyam < ajay) {
                System.out.println("Shyam is youngest.");
            } else {
                System.out.println("Ajay is youngest.");
            }
        }
    }
}
