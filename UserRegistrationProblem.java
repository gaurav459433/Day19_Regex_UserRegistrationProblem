package assignments259.day19regex;

public class UserRegistrationProblem {
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Program Using Regex: ");
        Logic logic = new Logic();
        logic.isValidFirstName();
        logic.isValidLastName();
        logic.isValidEmail();
        logic.isValidMobileNumber();
        logic.isValidPassword();
    }
}
