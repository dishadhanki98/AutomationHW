import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NopCommerceSendEmail
{
    protected static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\Drivers\\chromedriver_win32\\chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        //maximise screen window
        driver.manage().window().fullscreen();
        //setting time implicitly
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //open the website
        driver.navigate().to("https://demo.nopcommerce.com/");

        //click on Login
        driver.findElement(By.className("ico-login")).click();
        //Login with Email
        driver.findElement(By.name("Email")).sendKeys("p1335578893@my365.dmu.ac.uk");
        //typing password
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Lememes");
        //wait page load
        Thread.sleep(1000);
        //click Login
        driver.findElement(By.className("login-button")).click();
        //click on Computers from navigation bar
        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"] //a[@href=\"/computers\"]")).click();
        //Wait Page Load
        Thread.sleep(1000);

        //then click on Notebook
        driver.findElement(By.linkText("Notebooks")).click();
        //Wait Page Load
        Thread.sleep(1000);

        //Click on Apple MacBook product
        driver.findElement(By.linkText("Apple MacBook Pro 13-inch")).click();
        //wait page load
        Thread.sleep(1000);

        //click on Email a friend button
        driver.findElement(By.xpath("//input[@value=\"Email a friend\"]")).click();
        //wait page load
        Thread.sleep(1000);

        //Enter Friend's Email address
        driver.findElement(By.cssSelector("input[class='friend-email']")).sendKeys("dishadhanki1998@gmail.com");
        //wait page load
        Thread.sleep(1000);

        //Enter a message
        driver.findElement(By.xpath("//*[@id=\"PersonalMessage\"]")).sendKeys("It works!!");
        //wait page load
        Thread.sleep(1000);
        //Click on Send Email
        driver.findElement(By.className("send-email-a-friend-button")).click();
        //Wait
        Thread.sleep(2000);


        driver.close();


    }
}
