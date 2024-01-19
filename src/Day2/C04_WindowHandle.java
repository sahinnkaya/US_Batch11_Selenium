package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_WindowHandle {
    static WebDriver driver;
    public static void main(String[] args) {
        /*
        Retrieve the title and current URL of the website https://the-internet.herokuapp.com/
        using its WebDriver objects.
        Find the window handle value of the website https://the-internet.herokuapp.com/.
        Find the source codes of the website https://the-internet.herokuapp.com/.
        Find other driver.get..() objects and research their properties.
       */

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://the-internet.herokuapp.com/");

        System.out.println(chromeDriver.getTitle());
        System.out.println(chromeDriver.getWindowHandle());
        System.out.println(chromeDriver.getPageSource());

        // Expected Result => the expectation of the user
        // Actual Result => the result that application has now

    }
}
