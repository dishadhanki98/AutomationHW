import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AmazonLocator
{
    protected static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "src\\Drivers\\chromedriver_win32\\chromedriver.exe");
        //open the new browser
        driver = new ChromeDriver();
        //maximise window fullscreen
        driver.manage().window().fullscreen();
        //setting time implicitly
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //open the website
        driver.get("https://www.amazon.co.uk");

        //click on the basket
        driver.findElement(By.xpath("//a[@class=\"nav-a nav-a-2\" and @id=\"nav-cart\" ]")).click();

        driver.close();


    }
}
