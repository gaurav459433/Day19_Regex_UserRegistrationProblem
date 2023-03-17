package assignments259.day19regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logic {
    Scanner sc = new Scanner(System.in);
    private static String firstName;
    private static String lastName;
    private static String email;
    private static String mobNumber;

    // Method For First Name Validation
    public void isValidFirstName() {
        System.out.println("Enter First Name: ");
        firstName = sc.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("Entered First Name is Valid: ");
        } else {
            System.out.println("Entered First Name is Invalid: ");
        }
        System.out.println();
    }

    // Method For Last Name Validation
    public void isValidLastName() {
        System.out.println("Enter Last name: ");
        String lastName = sc.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("Entered Last Name is Valid: ");
        } else {
            System.out.println("Entered Last Name is Invalid: ");
        }
        System.out.println();
    }

    // Method For Email Validation
    public void isValidEmail() {
        System.out.println("Enter EmailId: ");
        String email = sc.next();
        String regex = "^[a-zA-Z0-9][a-zA-Z-0-9+]*([.][a-zA-Z0-9]+)?[@][a-zA-Z-0-9]+[.][a-z]{2,4}([.][a-zA-Z]{2,4})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("It is a valid EmailId: ");
        } else {
            System.out.println("Entered EmailId is Invalid: ");
        }
        System.out.println();
    }

    // Method For Mobile Validation
    public void isValidMobileNumber() {
        System.out.println("Enter Mobile Number Number: ");
        String mobNumber = sc.nextLine();
        String regex = "^(91)[ ][0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobNumber);
        if (matcher.matches())
            System.out.println("It is a Valid Mobile Number: ");
        else
            System.out.println("Entered Mobile Number is Invalid: ");
    }
}
