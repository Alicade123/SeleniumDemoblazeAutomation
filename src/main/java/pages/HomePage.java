package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    protected WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    //1. SignUp
    private By signupLink = By.id("signin2");
    private By signupUsername = By.id("sign-username");
    private By signupPassword = By.id("sign-password");
    private By signupButton = By.cssSelector("button[onclick='register()']");
    public String clickSignup(String username, String password){
    driver.findElement(signupLink).click();
    driver.findElement(signupUsername).sendKeys(username);
    driver.findElement(signupPassword).sendKeys(password);
    driver.findElement(signupButton).click();
    String alertStatus  = driver.switchTo().alert().getText();
    driver.switchTo().alert().accept();
    return alertStatus;
    }



}
