package assignments259.day19regex;

import java.util.Scanner;

public class UserRegistrationProblem {
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Program Using Regex: ");
        Logic logic = new Logic();
        Scanner sc = new Scanner(System.in);
        int flag = 1;

        while (flag == 1) {
            System.out.println("Select a choice : \n1. ValidateFirstName \n2. ValidateLastName  \n3. ValidateEmails \n4. ValidateMobileNumber " +
                                                  "\n5. ValidatePassword \n6. ValidInvalidEmails \n7. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    logic.isValidFirstName();
                    break;
                case 2:
                    logic.isValidLastName();
                    break;
                case 3:
                    logic.isValidEmail();
                    break;
                case 4:
                    logic.isValidMobileNumber();
                    break;
                case 5:
                    logic.isValidPassword();
                    break;
                case 6:
                    logic.checkingForValidInvalidEmails();
                    break;
                case 7:
                    flag = 0;
                    System.out.println("Successfully Exited");
                    break;
                default:
                    System.out.println(" Enter a valid choice");
                    break;
            }
        }
    }
}
