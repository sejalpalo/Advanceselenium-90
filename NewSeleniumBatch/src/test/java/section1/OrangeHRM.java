package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
    WebDriver driver;
    public void accessBrowser() {
    driver=new ChromeDriver();
    driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://opensource-demo.orangehrmlive.com/web/auth/login");
    }
    public void login() {
    	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
    	
    }

}
