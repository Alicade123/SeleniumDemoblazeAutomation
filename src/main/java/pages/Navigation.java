package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Navigation {
    protected WebDriver driver;
    protected WebDriverWait wait;
    public  Navigation(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    private By home = By.partialLinkText("Home");
    private By contact = By.linkText("Contact");
    private By contactLebal = By.id("exampleModalLabel");
    private By contactCloseBtn = By.cssSelector("#exampleModal button[class='btn btn-secondary']");

    private By aboutus = By.linkText("About us");
    private By aboutUsLebal = By.id("videoModalLabel");
    private By aboutUsCloseBtn = By.cssSelector("#videoModal button[class='btn btn-secondary']");

    private By cartHeader = By.cssSelector(".col-lg-8 h2");
    private By cart = By.id("cartur");

    private By  login = By.id("login2");
    private By loginLabel = By.cssSelector("#logInModal #logInModalLabel");
    private By loginCloseButton = By.cssSelector("#logInModal button[class='btn btn-secondary']");

    private By signup = By.id("signin2");
    private By signupLabel = By.id("signInModalLabel");
    private By signupCloseButton = By.cssSelector("#signInModal button[class='btn btn-secondary']");

    public void clickLink(By link){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(link)));
        driver.findElement(link).click();
    }

    public String clickHome(){
        clickLink(home);
        return driver.getTitle();
    }
    public String clickContact(){
        clickLink(contact);
        String contactHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(contactLebal)).getText();
        WebElement closeBtn = wait.until(ExpectedConditions.elementToBeClickable(contactCloseBtn));
        closeBtn.click();
        return contactHeader;
    }
    public String clickAboutUs(){
        clickLink(aboutus);
        String aboutLebal = wait.until(ExpectedConditions.visibilityOfElementLocated(aboutUsLebal)).getText();
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(aboutUsCloseBtn));
        closeButton.click();
        return aboutLebal;
    }
    public String clickCart(){
        clickLink(cart);
        String cartLebal = wait.until(ExpectedConditions.visibilityOfElementLocated(cartHeader)).getText();
        return cartLebal;
    }
    public String clickLogin(){
        clickLink(login);
        String loginLebal = wait.until(ExpectedConditions.visibilityOfElementLocated(loginLabel)).getText();
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(loginCloseButton));
        closeButton.click();
        return loginLebal;
    }
    public String clickSignup(){
        clickLink(signup);
        String modalLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(signupLabel)).getText();
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(signupCloseButton));
        closeButton.click();
        return modalLabel;
    }
}
