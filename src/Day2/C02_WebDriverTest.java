package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_WebDriverTest {

    public static void main(String[] args) {

        // 1st step Navigate to Ebay
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.ebay.com");

        // Navigate to edge, internet explorer, firefox
        // WebDriver safariDriver = new SafariDriver();
        // safariDriver.get("https://www.ebay.com");


    }
}
