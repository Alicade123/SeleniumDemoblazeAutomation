package login;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseTests {
    @Test
    public  void testLoginWithValidData() throws InterruptedException {
        String username = "Alicade";
        String password = "a2d@2026";
       var dashboardPage = homePage.loginModal.login(username,password);
       String actualResult= dashboardPage.getStatus();
       String expectedResult = "Welcome "+username;
        assertEquals(actualResult,expectedResult,"Something went wrong");
    }
    //Todo:2 Test login with nonExisting user
    @Test
    private  void testLoginWithNonExistingData() throws InterruptedException {
        String username = "AlicadeAlicadeAlicadde";
        String password = "a2d@2026";
        String actualResult = homePage.loginModal.loginWithNonExistingUser(username, password);
        String expectedResult = "User does not exist.";
        assertEquals(actualResult,expectedResult,username+" Something went wrong");
    }


    //Todo:5 Test login without data
    @Test
    private  void testLoginWithoutData(){
        String actualResult = homePage.loginModal.loginWithoutData();
        String expectedResult = "Please fill out Username and Password.";
        assertEquals(actualResult,expectedResult, "Something went wrong");
    }


    @Test
    private  void testLoginWithValidUsernameBlankPassword() throws InterruptedException {
        String username = "Alicade1";
        String actualResult = homePage.loginModal.clickLoginWithOnlyUsername(username);
        String expectedResult = "Please fill out Username and Password.";
        assertEquals(actualResult,expectedResult,username+" Something went wrong");
    }

    @Test
    private  void testSignupWithValidPasswordBlankUsername() throws InterruptedException {
        String password = "a2d@2026";
        String actualResult = homePage.loginModal.clickLoginWithOnlyPassword(password);
        String expectedResult = "Please fill out Username and Password.";
        assertEquals(actualResult,expectedResult,"Something went wrong");
    }

}
