//5. Convert Kilometers to Miles and converts it into miles using the formula:Miles = Kilometers * 0.621371.

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();

        double miles = km * 0.621371;
        System.out.println(km + " kilometers is " + miles + " miles.");
    }
}