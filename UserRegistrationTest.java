package assignments259.day19regex;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest {
    UserRegistration userregistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = userregistration.firstName("Gaurav");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        boolean result = userregistration.firstName("gaur");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = userregistration.lastName("Kumar");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        boolean result = userregistration.lastName("kum");
        Assert.assertEquals(false, result);

    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean result = userregistration.email("gaurav123@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        boolean result = userregistration.email("gaurav&123.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPhoneNumber_WhenProper_shouldReturnTrue() {
        boolean result = userregistration.phoneNumber("91 9911223344");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
        boolean result = userregistration.phoneNumber("919911223344");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean result = userregistration.password("Qwertyuiop");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        boolean result = userregistration.password("qwertyyuuiop");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
        boolean result = userregistration.password2("Qwertyu12");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
        boolean result = userregistration.password2("qwerrty");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
        boolean result = userregistration.password3("qwertyuio");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse() {
        boolean result = userregistration.password3("qwertyuioggggp");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPasswordRule4_WhenProper_ShouldReturnTrue() {
        boolean result = userregistration.password4("Qwerty@12");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule4_WhenNotProper_ShouldReturnFalse() {
        boolean result = userregistration.password4("Qwerty12");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail8_WhenNotProper_ShouldReturnTrue() {
        boolean result = userregistration.emailIdValidator("abc.xyz@bl.co.in");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail9_WhenNotProper_ShouldReturnFalse() {
        boolean result = userregistration.emailIdValidator("abc..2002@gmail.com");
        Assert.assertEquals(false, result);
    }

}
