package homework6;

import java.util.Scanner;
public class GetAverageSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("The average of " + a + " and " + b + " is " + getAverage(a, b));
        System.out.println("The sum of " + a + " and " + b + " is " + getSum(a, b));
    }

    public static double getAverage(double a, double b) {
        return (a + b) / 2;
    }

    public static double getSum(double a, double b) {
        return (a + b);
    }
}