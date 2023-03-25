package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElement {
    public static void main(String[] args) {

        //  tell your project where the webdriver is located
            System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
            // create an istance of webdriver
            WebDriver driver=new ChromeDriver();
            // open the Website facebook.com
            driver.get("https://www.facebook.com/");

            // send in the Username
        driver.findElement(By.id("email")).sendKeys("Alaa");
//send teh password
        driver.findElement(By.name("pass")).sendKeys("abracadabra");
        //click on the button to create new account
      //  driver.findElement(By.linkText("Create new account")).click();
// click on forgotten password
        driver.findElement(By.partialLinkText("password")).click();
        driver.quit();
    }
}
