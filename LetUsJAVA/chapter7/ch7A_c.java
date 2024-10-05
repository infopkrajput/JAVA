public class ch7A_c {
    public static void main(String[] args) {
        float area;
        int radius = 1;
        area = areaOfCircle(radius);
        System.out.println(area);
    }

    static float areaOfCircle(int r) {
        float a;
        a = 3.14f * r * r;
        return (a);
    }
}
