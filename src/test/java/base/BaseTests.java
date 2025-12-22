package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

public class BaseTests {
    protected WebDriver driver;
    protected  HomePage homePage;
    private String websiteUrl= "https://www.demoblaze.com/";
    @BeforeClass
    public void setUp(){
        driver  = new ChromeDriver();
        driver.get(websiteUrl);
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
    }

//    @AfterClass
    public void tearDown(){
        if(driver!=null) driver.quit();
    }
}
