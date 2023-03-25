package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        //maximize the window
        driver.manage().window().maximize();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // go to facebook
        driver.get("https://www.facebook.com");
       // click on the create new account


                driver.findElement(By.xpath("Create new account")).click();
// send first name
        driver.findElement(By.name("firstname")).sendKeys("abracadabra");


    }
}
