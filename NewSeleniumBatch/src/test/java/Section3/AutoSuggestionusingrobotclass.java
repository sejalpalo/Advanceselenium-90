package Section3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionusingrobotclass {

	public static void main(String[] args) throws Throwable {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.get("https://www.amazon.in/");
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone15");
     Robot r=new Robot();
     
     r.delay(2000);
      
     for(int i=0;i<2;i++) {
    	 r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
     }
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
     
     
	}

}

