package Section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowRoot2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demoapps.qspiders.com/shadow?sublist=0");
	    	
	    //username
	    WebElement ele = driver.findElement(By.cssSelector("form[class='pe-5']>div"));
	    SearchContext shadowRoot1 = ele.getShadowRoot();
	    shadowRoot1.findElement(By.cssSelector("[placeholder='Enter your username']")).sendKeys("sejal");
	    
	    //password
	    WebElement ele1 = driver.findElement(By.cssSelector("form[class='pe-5']>div+div"));
	    SearchContext shadowRoot2 = ele1.getShadowRoot();
	    shadowRoot2.findElement(By.cssSelector("[placeholder='Enter your password']")).sendKeys("palo");
	    
	    //login
	    driver.findElement(By.cssSelector("[type='submit']")).click();
	    
	}

}

