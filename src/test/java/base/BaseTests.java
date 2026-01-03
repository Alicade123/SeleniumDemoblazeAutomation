package base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
    @AfterMethod
    public void takeScreenshot(ITestResult result) throws IOException{
        TakesScreenshot camera = ((TakesScreenshot)driver);
        File img = camera.getScreenshotAs(OutputType.FILE);
        LocalDateTime now =LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd dd-HH-mm");
        String formattedTime = now.format(formatter);
        if(result.getStatus()==ITestResult.FAILURE)Files.move(img.toPath(), new File("resources/failed/img"+formattedTime+".png").toPath());
        else if(result.getStatus()==ITestResult.SUCCESS)Files.move(img.toPath(), new File("resources/passed/img"+formattedTime+".png").toPath());
        else System.out.println("Unexpected Error occurred");
    }

    @AfterClass
    public void tearDown(){
        if(driver!=null) driver.quit();
    }

}
