package javaIntro;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Please, enter your age");
        int age = scanner.nextInt();

        System.out.println("Hi, " + name + " your age is " + age);

        if (age >= 18) {
            System.out.println(name + " is able to drink.");
        } else {
            System.out.println(name + " is not able to drink.");
        }


    }
}





