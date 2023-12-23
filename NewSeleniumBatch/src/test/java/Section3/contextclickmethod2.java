package Section3;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclickmethod2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.google.co.in/");
	    //location for search bar
	   WebElement ele = driver.findElement(By.name("q"));
	   //right click
	   Actions act=new Actions(driver);
	   act.contextClick(ele).perform();
	   //downn downn
	   Robot r=new Robot();
	    r.delay(1000);
	    for(int i=0;i<11;i++) {
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    
		}
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	}

}
