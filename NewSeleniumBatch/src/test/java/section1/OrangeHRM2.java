package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM2 {

	public static void main(String[] args) throws Throwable {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://opensource-demo.orangehrmlive.com/web/auth/login");
    //WebElement ele = driver.findElement(By.linkText("OrangeHRM, Inc"));
    //ele.click();
    WebElement element = driver.findElement(By.partialLinkText("OrangeHRM"));
    element.click();
    
	}

}
