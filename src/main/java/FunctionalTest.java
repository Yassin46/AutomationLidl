import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTest {

    protected static WebDriver driver;


    public static void setUp() {


        System.setProperty("webdriver.chrome.driver", "/Users/Yassin/Desktop/Softwares/Drivers/chromedriver");

        driver = new ChromeDriver();
        driver.get("https://www.lidl-shop.be");

    }

    public void cleanUp() {
        driver.manage().deleteAllCookies();
    }

    public static void tearDown() {
        //driver.close();
    }


}
