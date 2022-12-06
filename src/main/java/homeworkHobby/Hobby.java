package homeworkHobby;

import java.util.Scanner;

public class Hobby {
    public static void main(String[]args){

        System.out.println("Please enter your name:");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Please enter your favorite hobby: ");
        String hobby = scanner.nextLine();

        System.out.println("Hello " + name + "! Your favorite hobby is " + hobby + ".");

    }
}
