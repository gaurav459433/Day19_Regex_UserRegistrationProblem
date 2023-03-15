package assignments259.day19regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
    public static boolean isValidFirstName(String firstName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(firstName);
        return match.matches();
    }

    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Program Using Regex: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String name = sc.next();
        if (isValidFirstName(name))
            System.out.println("Entered First Name is Valid: ");
        else
            System.out.println("Entered First Name is Invalid: ");
    }
}
