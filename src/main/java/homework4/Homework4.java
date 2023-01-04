package homework4;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        //task 1
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
            System.out.printf("The index %d has value %d%n", i, array[i]);
        }

        //task 2
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }

        int average = total / array.length;
        System.out.printf("%nThe average of the numbers in the array is %d%n", average);

        //task 3
        int evenSum = 0;
        for (int i = 0; i < array.length; i++)
            if (i % 2 == 0) {
                evenSum = evenSum + array[i];
            }
        System.out.printf("%nThe sum of even numbers is %d%n", evenSum);

        int oddSum = 0;
        for (int i = 0; i < array.length; i++)
            if (i % 2 != 0) {
                oddSum = oddSum + array[i];
            }
        System.out.printf("The sum of odd numbers is %d%n", oddSum);


        //task 4
        {
            System.out.println("\nEnter the length of the new array:");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] newArray = new int[n];

            int i;
            for (i = 0; i < newArray.length; i++) {
                newArray[i] = i + 1;
                System.out.println(newArray[i]);
            }


            //task 5
            System.out.println("\nThe numbers that are not divisible by 3 and 7 are: ");
            for (i = 0; i <= newArray.length; i++) {
                if ((i % 3 == 0) || (i % 7 == 0)) {
                    continue;
                }
                System.out.println(i);
            }

            //task 6

            System.out.println("\nPlease enter a length for the Fibonacci sequence: ");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();

            int[] values = new int[a];
            values[0] = 0;
            values[1] = 1;

            for(i = 2; i < a; i++){
                values[i] = values[i - 1] + values[i - 2];}
            for(i = 0; i < a; i++){
                System.out.println(values[i]);}

        }
    }
}












