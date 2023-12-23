package Section3;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Seleniumwebpage {

	public static void main(String[] args) {
		ChromeOptions op=new ChromeOptions ();
	    op.addArguments("--disable-notifications");
    WebDriver driver=new ChromeDriver(op);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
    driver.switchTo().frame("iframe_a");
    driver.findElement(By.xpath("//b//a[.='Free Mock Tests']")).click();
    //window handle
    String pid = driver.getWindowHandle();
    Set<String> allid = driver.getWindowHandles();
    for(String r:allid) {
    	if(!(pid.equals(r))) {
    		driver.switchTo().window(r);
    	}
    }
   
    driver.findElement(By.cssSelector("[type='number']")).sendKeys("7064114975");
    
    
	}

}
