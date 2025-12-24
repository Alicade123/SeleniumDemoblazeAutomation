package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {
    protected  WebDriver driver ;
    protected WebDriverWait wait;
    DashboardPage (WebDriver driver){
        this.driver = driver ;
        this.wait =new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    private By nameofuser = By.id("nameofuser");
    public String getStatus (){
        return  wait
                .until(ExpectedConditions
                        .visibilityOfElementLocated(nameofuser)).getText();

    }

}
