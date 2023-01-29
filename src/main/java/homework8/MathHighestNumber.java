package homework8;

import java.util.Scanner;

public class MathHighestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers one by one:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = Math.max(Math.max(num1, num2), num3);
        System.out.println(max + " is the highest number.");
    }
}
