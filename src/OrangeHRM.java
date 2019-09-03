import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHRM
{
    protected static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\Drivers\\chromedriver_win32\\chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        //maximise fullscreen window
        driver.manage().window().fullscreen();
        //setting time implicitly
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //open the website
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //typing username
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        //typing password
        driver.findElement(By.xpath("//input[@type=\"password\" or @name=\"txtPassword\"]")).sendKeys("admin123");
        //login
        driver.findElement(By.id("btnLogin")).click();
        //waits for 5 seconds before clicking on admin and logging out
        Thread.sleep(5000);
        //click on welcome admin
        driver.findElement(By.xpath("//a[@href=\"#\" and @id=\"welcome\" and @class=\"panelTrigger\"]")).click();
        //logout
        driver.findElement(By.linkText("Logout")).click();
        //closes the current window
        driver.close();
    }
}
