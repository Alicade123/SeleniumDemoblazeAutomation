package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LoginModal {
    public  WebDriver driver;
    protected WebDriverWait wait;
    public Utils utils;
    public  LoginModal(WebDriver driver){
        this.driver =driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.utils = new Utils();
    }

    //1. Login
    private By loginLink  = By.id("login2");
    private By loginusername = By.id("loginusername");
    private By loginpassword = By.id("loginpassword");
    private By loginButton = By.cssSelector("button[onclick='logIn()']");

    public DashboardPage login(String username, String password) throws InterruptedException {
        driver.findElement(loginLink).click();
        List <WebElement> elements =  wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(loginusername),driver.findElement(loginpassword)));
        utils.highlightElement(driver, elements.get(0));
        driver.findElement(loginusername).sendKeys(username);
        utils.highlightElement(driver, elements.get(1));
        driver.findElement(loginpassword).sendKeys(password);
        driver.findElement(loginButton).click();
        return new DashboardPage(driver);
    }
    //ToDo:2
    public String loginWithoutData(){
        driver.findElement(loginLink).click();
        List <WebElement> elements =  wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(loginusername),driver.findElement(loginpassword)));
        driver.findElement(loginButton).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String statusMessage = alert.getText();
        alert.accept();
        return  statusMessage;
    }

    //ToDo:4
    public String  loginWithNonExistingUser(String username, String password) throws InterruptedException {
        driver.findElement(loginLink).click();
        List <WebElement> elements =  wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(loginusername),driver.findElement(loginpassword)));
        utils.highlightElement(driver, elements.get(0));
        driver.findElement(loginusername).sendKeys(username);
        utils.highlightElement(driver, elements.get(1));
        driver.findElement(loginpassword).sendKeys(password);
        driver.findElement(loginButton).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String statusMessage = alert.getText();
        alert.accept();
        return  statusMessage;
    }
    public  String clickLoginWithOnlyUsername(String username) throws InterruptedException {
        driver.findElement(loginLink).click();
        WebElement element =  wait.until(ExpectedConditions.visibilityOf(driver.findElement(loginusername)));
        utils.highlightElement(driver, element);
        driver.findElement(loginusername).sendKeys(username);
        driver.findElement(loginButton).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String statusMessage = alert.getText();
        alert.accept();
        return  statusMessage;
    }
    public  String clickLoginWithOnlyPassword(String password) throws InterruptedException {
        driver.findElement(loginLink).click();
        WebElement element =  wait.until(ExpectedConditions.visibilityOf(driver.findElement(loginpassword)));
        utils.highlightElement(driver, element);
        driver.findElement(loginpassword).sendKeys(password);
        driver.findElement(loginButton).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String statusMessage = alert.getText();
        alert.accept();
        return  statusMessage;
    }
}
