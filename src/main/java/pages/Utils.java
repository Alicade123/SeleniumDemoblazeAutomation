package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Utils {
        public void highlightElement(WebDriver driver, WebElement element) throws InterruptedException {
            String originalStyle = element.getAttribute("style");

            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "border: 2px solid red; background: yellow;");
            Thread.sleep(500);

            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, originalStyle);
        }
    }


