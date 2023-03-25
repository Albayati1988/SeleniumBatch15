package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) {
        // connect the webDriver
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        // create an instance of Webdriver
        WebDriver driver=new ChromeDriver();

       // goto google .com
        driver.get("http://google.com");
       // maximize the window
        driver.manage().window().maximize();
        // full screen
        driver.manage().window().fullscreen();
        driver.close();
    }
}
