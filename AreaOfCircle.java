//4. Area of a Circle
//Write a program to calculate the area of a circle. Take the radius as inputand use the formula:Area = π * radius^2.
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
}