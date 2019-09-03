import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NopCommerce
{
    protected static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\Drivers\\chromedriver_win32\\chromedriver.exe");

        //open the browser
        driver = new ChromeDriver();
        //maximise the browser window screen
        driver.manage().window().fullscreen();
        //set implicitly wait for driver project
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        //open the website
        driver.get("https://demo.nopcommerce.com/");

        //click on register button
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //enter firstname
        driver.findElement(By.id("FirstName")).sendKeys("Mememe");
        //enter lastname
        driver.findElement(By.xpath("//input[@name=\"LastName\" or id=\"LastName\"]")).sendKeys("Doe");
        //enter email
        driver.findElement(By.name("Email")).sendKeys("p1335578893@my365.dmu.ac.uk");
        //enter password
        driver.findElement(By.xpath("//input[@data-val-required=\"Password is required.\" and @id=\"Password\"]")).sendKeys("Lememes");
        //confirm password
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Lememes");

        //wait before closing the window
        Thread.sleep(1000);

        //click register
        driver.findElement(By.className("register-next-step-button")).click();

        //wait
        Thread.sleep(1000);

        //close the current window
        driver.close();

        



    }



}
