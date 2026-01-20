public class ch7B_d {
    public static void main(String[] args) {
        float area;
        int radius = 1;
        area = AreaOfCircle(radius);
        System.out.println(area);
    }

    public static float AreaOfCircle(int r) {
        float a;
        a = 3.14f * r * r;
        return (a);
    }
}
