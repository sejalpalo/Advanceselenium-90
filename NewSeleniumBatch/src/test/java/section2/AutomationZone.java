package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationZone {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
     String text= driver.findElement(By.cssSelector("p[class*='cl']")).getText();
    
     System.out.println(text);
	}

}
