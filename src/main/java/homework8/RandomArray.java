package homework8;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Enter the length of the array:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1,100);
            System.out.println(array[i]);
        }
    }
}
