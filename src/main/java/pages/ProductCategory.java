package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductCategory {
    protected  WebDriver  driver ;
    protected JavascriptExecutor js;
    protected Utils utils;
    public  ProductCategory(WebDriver driver){
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
        this.utils = new Utils();
    }

    private By phoneCategory = By.cssSelector("a[onclick=\"byCat('phone')\"]");
    private By laptopCategory = By.cssSelector("a[onclick=\"byCat('notebook')\"]");
    private By monitorCategory = By.cssSelector("a[onclick=\"byCat('monitor')\"]");

public  void clickProductCategory(String category) throws InterruptedException {

    if (category.equalsIgnoreCase("phone")){
        WebElement element = driver.findElement(phoneCategory);
        js.executeScript("arguments[0].scrollIntoView({block:'center'});",element);
        utils.highlightElement(driver,element);
        driver.findElement(phoneCategory).click();
    }   else if (category.equalsIgnoreCase("laptop")){
        WebElement element = driver.findElement(laptopCategory);
        js.executeScript("arguments[0].scrollIntoView({block:'center'});",element);
        utils.highlightElement(driver,driver.findElement(laptopCategory));
        driver.findElement(laptopCategory).click();
    }   else if (category.equalsIgnoreCase("monitor")){
        WebElement element = driver.findElement(monitorCategory);
        js.executeScript("arguments[0].scrollIntoView({block:'center'});",element);
        utils.highlightElement(driver,driver.findElement(monitorCategory));
        driver.findElement(monitorCategory).click();
    }
}
}
