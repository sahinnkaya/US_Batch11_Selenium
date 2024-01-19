package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class C01_WebDriver {

    // static WebDriver driver = new SafariDriver();

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");

        // SafariOptions options = new SafariOptions();
        // driver = new SafariDriver(options);
        // driver.get("https://www.ebay.com");


    }
}
