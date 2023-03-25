package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-905597060%3A1678243085084185&continue=https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3Dgmail%2Blogin%26oq%3Dgmail%26aqs%3Dchrome.1.69i57j0i10i131i433i512l2j0i10i433i512j0i10i131i433i512j0i10i433i512j0i10i131i433i512l2j0i10i512.6640j0j7%26sourceid%3Dchrome%26ie%3DUTF-8&ec=GAZAAQ&hl=en&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHcaHPPYodwq6R3vF0pr6qnrTvGexhh_mOqNlv-xSCtNs215g_F-yCcokczptAend8orN4A_");
      //click on the help button
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        //click on privacy
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        // get the window handle of the parent window
        String parentWindowHandle = driver.getWindowHandle();
        System.out.println(parentWindowHandle);

        // get window handles of all the windows that have been opened up
        Set<String>windowHandles = driver.getWindowHandles();
        // print all the window handles
        for (String wh:windowHandles){
            System.out.println(wh);
            // switch the focus of the driver to help window
            driver.switchTo().window(wh);
            // check the title of the  window to which our focus is right now
            String title=driver.getTitle();
            if (title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
                break;
            }

        }
        // to verify we switch to the right window
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentWindowHandle);

    }
}
