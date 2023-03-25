package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselctor {
    public static void main(String[] args) throws InterruptedException {
        //  tell your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        //        create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement createNewBtn=driver.findElement(By.cssSelector("a[data-testid= 'open-registration-form-button"));
        createNewBtn.click();
        // add sleep
        // put a sleep statement so that the browser can open up the window which contains the element.
        Thread.sleep(2000);
        WebElement firstname = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstname.sendKeys("abracadabra");



    }
}
