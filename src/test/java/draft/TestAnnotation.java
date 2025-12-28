package draft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAnnotation {
WebDriver driver;
    @Test
    @Parameters({"URL", "BrowserType"})
    public void runSite(String url, String browserType){
        switch(browserType.toLowerCase()) {
            case "chrome": {
//                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            }
            case "firefox": {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            }
            case "internet explorer": {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            }
            default: throw new IllegalArgumentException("Unsupported browser: " + browserType);
        }

        try {
            driver.get(url);
            driver.manage().window().maximize();
            System.out.println("The browser type is: " + browserType);
            System.out.println("The site title: " + driver.getTitle());
        } finally {
            driver.quit();
        }
    }

}
