package draft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAnnotation {
    private WebDriver driver;
    @Test
    @Parameters ({"URL", "BrowserType"})
    private void runSite(String url , String browserType){
         if(browserType.equalsIgnoreCase("internet explorer")){
             driver = new InternetExplorerDriver();
         }else if(browserType.equalsIgnoreCase("chrome")){
             driver = new ChromeDriver();
         }else if (browserType.equalsIgnoreCase("firefox")){
             driver = new FirefoxDriver();
         }
         driver.get(url);
         driver.manage().window().maximize();
        System.out.println("The browser type is: "+browserType);
        System.out.println("The site title: "+driver.getTitle());
        System.out.println("The closed browser is: "+browserType);
    }
}
