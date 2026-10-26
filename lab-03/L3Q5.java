import java.util.*;

public class L3Q5 {
    public static void main(String[] args) {
        Scanner tekan = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = tekan.nextDouble();
        System.out.print("Enter a point (x): ");
        double x = tekan.nextDouble();
        System.out.print("Enter a point (y): ");
        double y = tekan.nextDouble();

        double distance = Math.sqrt(x * x + y * y);
        if (distance <= radius) {
            System.out.printf("Point (%.2f, %.2f) is inside the circle%n", x, y);
        } else {
            System.out.printf("Point (%.2f, %.2f) is outside the circle%n", x, y);
        }
    }
}