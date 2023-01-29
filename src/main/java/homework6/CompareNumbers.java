package homework6;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter one by one your three numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(positiveNumbers(a, b, c) + " numbers are positive");
        System.out.println(equalNumbers(a, b, c) + " numbers are equal");
    }

    public static int positiveNumbers(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
            return (3);
        } else if (a > 0 && b > 0 && c <= 0 || a > 0 && c > 0 && b <= 0 || a <= 0 && b > 0 && c > 0) {
            return (2);
        } else if (a > 0 && b <= 0 && c <= 0 || a > 0 && c <= 0 && b <= 0 || a <= 0 && b <= 0 && c > 0) {
            return (1);
        }
        return (0);
    }

    public static int equalNumbers(int a, int b, int c) {
        if (a == b && b == c) {
            return (3);
        } else if ((a == b && b != c) || (b == c && a != b)) {
            return (2);
        }
        return (0);

    }
}






