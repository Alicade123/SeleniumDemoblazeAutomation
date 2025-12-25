package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    public  SignupModel signupModel;
    public LoginModal loginModal;
    public Navigation navigation;
    public  ProductCategory productCategory;
    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        signupModel = new SignupModel(driver);
        loginModal = new LoginModal(driver);
        navigation = new Navigation(driver);
        productCategory = new ProductCategory(driver);
    }



}
