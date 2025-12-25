package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NavigationTests extends BaseTests {
    @Test
    public  void testNavigationBar(){

        //homepage
        String  actualResult =homePage.navigation.clickHome();
        String expectedResult = "STORE";
        assertEquals(actualResult, expectedResult, "Oops! Alicade something went wrongly");

        //contact
        String contactActualResult = homePage.navigation.clickContact();
        String contactExpectedResult = "New message";
        assertEquals(contactActualResult, contactExpectedResult, "Alicade Something went wrong");

        //about us
        String aboutUsActualResult = homePage.navigation.clickAboutUs();
        String aboutUsExpectedResult ="About us";
        assertEquals(aboutUsActualResult,aboutUsExpectedResult, "Alicade Something went wrong");

        //Cart
        String cartActualResult = homePage.navigation.clickCart();
        String cartExpectedResult = "Products";
        assertEquals(cartActualResult,cartExpectedResult, "Oops! Alicade something went wrong");

        //login
        String loginActualResult = homePage.navigation.clickLogin();
        String loginExpectedResult ="Log in";
        assertEquals(loginActualResult,loginExpectedResult, "Alicade Something went wrong");
        //sign up
        String signupActualResult = homePage.navigation.clickSignup();
        String signupExpectedResult ="Sign up";
        assertEquals(signupActualResult,signupExpectedResult, "Alicade Something went wrong");

    }
}
