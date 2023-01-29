package homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        //task 1
        String test = "Your name is <my name>.";
        System.out.println("Enter your name");

        Scanner scanner = new Scanner(System.in);
        String yourName = scanner.nextLine();

        String result = test.replace("<my name>", yourName);
        System.out.println(result);

        //task 2
        String str1 = "Enter your first phrase: ";
        System.out.println(str1);
        String phrase1 = scanner.nextLine();

        String str2 = "Enter the phrase you want to compare with: ";
        System.out.println(str2);
        String phrase2 = scanner.nextLine();

        System.out.println("Both phrases are equal: " + phrase1.equalsIgnoreCase(phrase2));

        //task 3
        String input = "Enter your sentence here: ";
        System.out.println(input);
        String words = scanner.nextLine();

        int countWords = words.split("\\s").length;
        System.out.println("There are " + countWords + " words in this phrase." + '\n');

        //task 4
        String s1 = "Enter the beginning of your text: ";
        System.out.println(s1);
        String beginningText = scanner.nextLine();

        String s2 = "Enter the end of your text: ";
        System.out.println(s2);
        String endText = scanner.nextLine();

        String s3 = (beginningText + " " + endText);
        System.out.println(s3);
    }
}
