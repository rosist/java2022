package homework6;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password");
        String s = scanner.nextLine();
        if (validPassword(s)) {
            System.out.println("Is valid password");
        } else {
            System.out.println("The password is invalid");
        }
    }

    public static boolean validPassword(String password) {
        String regex = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!?^&+=]).*$";
        return password.matches(regex);
    }

}

