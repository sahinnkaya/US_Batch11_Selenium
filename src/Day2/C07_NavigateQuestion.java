package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_NavigateQuestion {

    public static void main(String[] args) {


        /*
        Let's create a new Class named C07_NavigateQuestion.

        Go to the YouTube homepage. https://www.youtube.com/
        Go to the Amazon page. https://www.amazon.com/
        Return to the YouTube page.
        Go back to the Amazon page again.
        Refresh the page.
        Close all pages.
        */


        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.navigate().to("https://www.youtube.com/");
        chromeDriver.navigate().to("https://www.amazon.com/");
        chromeDriver.navigate().back();
        chromeDriver.navigate().forward();
        chromeDriver.navigate().refresh();
        // chromeDriver.close();

    }


}
