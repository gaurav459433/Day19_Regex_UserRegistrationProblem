package assignments259.day19regex;

import org.junit.Assert;
import org.junit.Test;

public class InvalidUserInputException extends Exception {
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        try {
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.firstNameValidate("Gaurav");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.firstNameValidate("gaur");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.lastNameValidate("Kumar");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.lastNameValidate("kum");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.phoneNumberValidate("91 9911223344");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.phoneNumberValidate("9911223344");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.passwordValidate("Abc12345#");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.passwordValidate("Gaur@12");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }
}
