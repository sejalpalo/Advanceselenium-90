package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookApplication {

	public static void main(String[] args) throws Throwable {
		
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.get("https://www.facebook.com/");
   WebElement ele = driver.findElement(By.linkText("Forgotten password?"));
   //ele.click();
   
   String tag = ele.getTagName();
   System.out.println(tag);
   
   String value = ele.getAttribute("href");
   System.out.println(value);
  
   String text = ele.getText();
   System.out.println(text);
   Thread.sleep(2000);
   driver.quit();
	}
}
   
	


