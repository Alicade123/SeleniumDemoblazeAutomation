package sigup;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SignupTests extends BaseTests {
@Test
    private  void testSignupWithValidDate(){
    String username = "Alicade";
    String password = "a2d@2026";
    String actualResult = homePage.clickSignup(username, password);
    String expectedResult = "Sign up successful.";
    assertEquals(actualResult,expectedResult,username+" Something went wrong");
}
}
