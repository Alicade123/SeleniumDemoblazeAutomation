package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignupModel {
    protected WebDriver driver;
    protected WebDriverWait wait;
    public SignupModel(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    //1. SignUp
    private By signupLink = By.id("signin2");
    private By signupUsername = By.id("sign-username");
    private By signupPassword = By.id("sign-password");
    private By signupButton = By.cssSelector("button[onclick='register()']");
    public String clickSignup(String username, String password){
        driver.findElement(signupLink).click();
        wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(signupUsername),driver.findElement(signupPassword)));
        driver.findElement(signupUsername).sendKeys(username);
        driver.findElement(signupPassword).sendKeys(password);
        driver.findElement(signupButton).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertStatus  = alert.getText();
        alert.accept();
        return alertStatus;
    }

    public String clickSignupOnlyUsername(String username){
        driver.findElement(signupLink).click();
        wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(signupUsername),driver.findElement(signupPassword)));
        driver.findElement(signupUsername).sendKeys(username);
        driver.findElement(signupButton).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertStatus  = alert.getText();
        alert.accept();
        return alertStatus;
    }

    public String clickSignupOnlyPassword(String password){
        driver.findElement(signupLink).click();
        wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(signupUsername),driver.findElement(signupPassword)));
        driver.findElement(signupPassword).sendKeys(password);
        driver.findElement(signupButton).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertStatus  = alert.getText();
        alert.accept();
        return alertStatus;
    }

    public String clickSignupWithEmptyData(){
        driver.findElement(signupLink).click();
        wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(signupUsername),driver.findElement(signupPassword)));
        driver.findElement(signupButton).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertStatus  = alert.getText();
        alert.accept();
        return alertStatus;
    }
}
