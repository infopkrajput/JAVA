// The X and Y coordinates of 10 different points are entered through the keyboard. Write a program to find the distance of last point from the first point (sum of distances between consecutive points).
package chapter11;

public class ch11Bf {
    static void main() {
        int[] x = {2, 5, 7, 3, 9, 4, 6, 8, 1, 0};
        int[] y = {3, 6, 2, 8, 1, 4, 7, 5, 9, 0};
        double distance = 0.0;
        for (int i = 0; i < x.length - 1; i++) {
            distance += Math.sqrt(Math.pow(x[i + 1] - x[i], 2) + Math.pow(y[i + 1] - y[i], 2));
        }
        System.out.println("Distance of last point from the first point: " + distance);
    }
}
