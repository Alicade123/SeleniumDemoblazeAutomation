package sigup;

import base.BaseTests;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class SignupTests extends BaseTests {
@Test
    private  void testSignupWithValidData(){
    String username = "Alicade2";
    String password = "a2d@2026";
    String actualResult = homePage.signupModel.clickSignup(username, password);
    String expectedResult = "Sign up successful.";
    assertEquals(actualResult,expectedResult,username+" Something went wrong");
}

    @Test
    private  void testSignupWithExistingData(){
        String username = "Alicade1";
        String password = "a2d@2026";
        String actualResult = homePage.signupModel.clickSignup(username, password);
        String expectedResult = "This user already exist.";
        assertEquals(actualResult,expectedResult,username+" Something went wrong");
    }

    @Test
    private  void testSignupWithValidUsernameBlankPassword(){
        String username = "Alicade1";
        String actualResult = homePage.signupModel.clickSignupOnlyUsername(username);
        String expectedResult = "Please fill out Username and Password.";
        assertEquals(actualResult,expectedResult,username+" Something went wrong");
    }

    @Test
    private  void testSignupWithValidPasswordBlankUsername(){
        String password = "a2d@2026";
        String actualResult = homePage.signupModel.clickSignupOnlyPassword(password);
        String expectedResult = "Please fill out Username and Password.";
        assertEquals(actualResult,expectedResult,"Something went wrong");
    }

    @Test
    private  void testSignupWithBlankData(){
        String actualResult = homePage.signupModel.clickSignupWithEmptyData();
        String expectedResult = "Please fill out Username and Password.";
        assertEquals(actualResult,expectedResult, "Something went wrong");
    }
}
