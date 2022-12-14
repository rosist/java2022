package homework3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //task1
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter three numbers.");

        double x = reader.nextDouble();
        double y = reader.nextDouble();
        double z = reader.nextDouble();

        if (x >= y){
            if(y >= z)
                System.out.print(x +" is the biggest number");
            else if  (z >= x)
                System.out.print(z +" is the biggest number");
            else if (x > z)
                System.out.print(x +" is the biggest number");}

        if (y > x){// In the three responses below, x is always before y
            if (z > y)
                System.out.print(z +" is the biggest number");
            else if (z > x)
                System.out.print(y +" is the biggest number");
            else if (x > z)
                System.out.print(y +" is the biggest number");}

        //task2
        System.out.println("\n \nEnter the length and width of the rectangle in centimeters:");

        double x1 = reader.nextDouble();
        double y1 = reader.nextDouble();

        double perimeter = 2 * (x1 + y1);
        double area = x1 * y1;
        System.out.println("The perimeter of the rectangle is " + perimeter + " cm");
        System.out.println("The area of the rectangle is " + area + " cm2");

        //task3
        System.out.println( "\nEnter a whole number of your choice:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a % 2 == 0){
            System.out.println("The number is even");
        }
            else {System.out.println("The number is odd");}


        System.out.println("\nSelect a number for a day of the week:");
        int dayOfTheWeek = scanner.nextInt();
        if (dayOfTheWeek == 1){
            System.out.println("Today is Monday.");
        }else if (dayOfTheWeek == 2){
            System.out.println("Today is Tuesday.");
        }else if (dayOfTheWeek == 3){
            System.out.println("Today is Wednesday.");
        } else if (dayOfTheWeek == 4) {
            System.out.println("YToday is Thursday.");
        }else if (dayOfTheWeek == 5){
            System.out.println("Today is Friday.");
        }else if (dayOfTheWeek == 6){
            System.out.println("Today is Saturday.");
        } else if (dayOfTheWeek == 7) {
            System.out.println("Today is Sunday.");
        }else {
            System.out.println("Invalid number entered. Please, choose a valid number from 1 to 7 for the day of the week");
        }

    }

}
