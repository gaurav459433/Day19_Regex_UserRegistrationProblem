package assignments259.day19regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
    // Method For First Name Validation
    public boolean isValidFirstName(String firstName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(firstName);
        return match.matches();
    }

    // Method For Last Name Validation
    public boolean isValidLastName(String lastname) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(lastname);
        return match.matches();
    }

    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Program Using Regex: ");
        UserRegistrationProblem user = new UserRegistrationProblem();
        Scanner sc = new Scanner(System.in);
        // For First Name
        System.out.println("Enter First Name: ");
        String firstName = sc.next();
        if (user.isValidFirstName(firstName))
            System.out.println("Entered First Name is Valid: ");
        else
            System.out.println("Entered First Name is Invalid: ");
        System.out.println();

        // For Last Name
        System.out.println("Enter Last name");
        String lastName = sc.next();
        if (user.isValidLastName(lastName))
            System.out.println("Entered Last Name is Valid: ");
        else
            System.out.println("Entered Last Name is Invalid: ");
    }
}
