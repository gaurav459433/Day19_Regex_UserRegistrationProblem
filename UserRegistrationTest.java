package assignments259.day19regex;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    Function<List<String>, List<Boolean>> firstNameTestCases = cases -> cases.stream().map(x -> {
        try {
            return userRegistration.firstNameValidate.userEntries(x);
        } catch (InvalidUserInputException e) {

        }
        return false;
    }).collect(Collectors.toList());

    Function<List<String>, List<Boolean>> lastNameTestCases = cases -> cases.stream().map(x -> {
        try {
            return UserRegistration.lastNameValidate.userEntries(x);
        } catch (InvalidUserInputException e) {


        }
        return false;
    }).collect(Collectors.toList());

    Function<List<String>, List<Boolean>> emailTestCases = cases -> cases.stream().map(x -> {
        try {
            return UserRegistration.emailValidate.userEntries(x);
        } catch (InvalidUserInputException e) {


        }
        return false;
    }).collect(Collectors.toList());

    Function<List<String>, List<Boolean>> phoneTestCases = cases -> cases.stream().map(x -> {
        try {
            return UserRegistration.phoneNumberValidate.userEntries(x);
        } catch (InvalidUserInputException e) {

        }
        return false;
    }).collect(Collectors.toList());

    Function<List<String>, List<Boolean>> passwordTestCases = cases -> cases.stream().map(x -> {
        try {
            return UserRegistration.passwordValidate.userEntries(x);
        } catch (InvalidUserInputException e) {

        }
        return false;
    }).collect(Collectors.toList());

    @Test
    public void test_firstName_Cases() {
        List<Boolean> result = firstNameTestCases.apply(Arrays.asList("Krunali"));
        List<Boolean> expected = Arrays.asList(true);
        assertEquals(expected, result);
    }

    @Test
    public void test_lastName_Cases() {
        List<Boolean> result = lastNameTestCases.apply(Arrays.asList("Lole"));
        List<Boolean> expected = Arrays.asList(true);
        assertEquals(expected, result);
    }

    @Test
    public void test_email_Cases() {
        List<Boolean> result = emailTestCases.apply(Arrays.asList("abc@1.com"));
        List<Boolean> expected = Arrays.asList(true);
        assertEquals(expected, result);
    }

    @Test
    public void test_phoneNumber_Cases() {
        List<Boolean> result = phoneTestCases.apply(Arrays.asList("91 9561272972"));
        List<Boolean> expected = Arrays.asList(true);
        assertEquals(expected, result);
    }

    @Test
    public void test_password_Cases() {
        List<Boolean> result = passwordTestCases.apply(Arrays.asList("Krunali@1999"));
        List<Boolean> expected = Arrays.asList(true);
        assertEquals(expected, result);
    }


}
