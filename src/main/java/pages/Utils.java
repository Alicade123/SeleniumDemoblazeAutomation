package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Utils {
        public void highlightElement(WebDriver driver, WebElement element) throws InterruptedException {
            // Store original style to revert later
            String originalStyle = element.getAttribute("style");

            // Use JavascriptExecutor to apply a new style (e.g., red border and yellow background)
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "border: 2px solid red; background: yellow;");

            // Optional: Add a short delay to see the highlight
            Thread.sleep(500);

            // Revert to original style after the action
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, originalStyle);
        }
    }


