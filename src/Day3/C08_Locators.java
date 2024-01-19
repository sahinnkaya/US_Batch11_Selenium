package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C08_Locators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        // Locator with id gb-btn => all locators should be unique

        // We should assign the locators on WebElement class
        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        // We created locator for the search button on the main page
        // Now we can click on the button via this WebElement
        // We can test is this button visible or not
        // If the driver cannot find the object with findElement(), it throws a NoSuchElementException

        // Search Text box on the ebay main page
        WebElement searchTextBox = driver.findElement(By.name("_nkw"));
        // We can send test data (text) with locator
        searchTextBox.sendKeys("Galaxy AI");

        // Click on the search button with click() method
        searchButton.click();

        // Generally it is not recommended to find locator with class name
        // Because class can be a name of group
        // This approach is not acceptable
        List<WebElement> listClassLocators = driver.findElements(By.className("gh-p"));

        for (int i = 0; i < listClassLocators.size(); i++) {
            System.out.println(listClassLocators);
        }

        // Locator with linkText
        WebElement linkTextEbayLocator = driver.findElement(By.linkText("https://www.ebay.com"));
        linkTextEbayLocator.click();



    }
}
