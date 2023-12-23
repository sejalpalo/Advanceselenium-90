package Section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowRoot {

	public static void main(String[] args) throws Throwable {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://demoapps.qspiders.com/shadow?sublist=0");
    JavascriptExecutor js=(JavascriptExecutor)driver;
    
    js.executeScript("document.querySelector(\"form[class='pe-5']>div\").shadowRoot.querySelector(\"[placeholder='Enter your username']\").value=\"sejal\"");
    js.executeScript("document.querySelector(\"form[class='pe-5']>div+div\").shadowRoot.querySelector(\"[placeholder='Enter your password']\").value=\"palo\"");
    //not use shadowroot
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("[type='submit']")).click();
	}
}


