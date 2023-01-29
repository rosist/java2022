package homework8;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the first side of the triangle:");
        double a = scan.nextDouble();
        System.out.println("Enter the length of the second side of the triangle:");
        double b = scan.nextDouble();
        System.out.println("Enter the length of the third side of the triangle:");
        double c = scan.nextDouble();

        AreaOfTriangle at = new AreaOfTriangle();
        if (at.isTriangleValid(a, b, c)) {
            double area = at.calculateArea(a, b, c);
            System.out.printf("Area of triangle = %.2f ", area);
        } else {
            System.out.println("Invalid values for triangle sides");
        }
    }

    private double calculateArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private boolean isTriangleValid(double a, double b, double c) {
        if (a > 0 && b > 0 && c > 0 && (a + b) > c && (a + c) > b && (b + c) > a) {
            return true;
        } else {
            return false;
        }
    }
}

