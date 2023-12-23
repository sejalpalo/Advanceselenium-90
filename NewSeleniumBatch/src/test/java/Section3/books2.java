package Section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class books2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://books-pwakit.appspot.com");
		  //we can use xpath or css locator
		  WebElement ele = driver.findElement(By.xpath("//book-app[@apptitle='BOOKS']"));
		 SearchContext shadow1 = ele.getShadowRoot();
		 
		 //cssseletor locator
		 shadow1.findElement(By.cssSelector("[effects='waterfall'] [id='input']")).sendKeys("sejal");
		 
		  
	}

}
