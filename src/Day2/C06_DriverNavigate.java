package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_DriverNavigate {

    public static void main(String[] args) {

        /*
        Navigate the driver to the given URL.
        The difference from driver.get() is
        that with navigate methods, it can provide
        functions like back, forward for the pages visited
         */

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.ebay.com");

        // Returns the web page to the previous page.
        driver.navigate().back();

        /*
        If returned to the previous page from
        the visited web page
         */


    }
}
