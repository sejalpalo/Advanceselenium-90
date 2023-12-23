package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISdisplayedmethod {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.flipkart.com/");
   WebElement ele = driver.findElement(By.cssSelector("[class='_30XB9F']"));
  if(ele.isDisplayed()) {
    ele.click();
  }
  else {
	  
  }
    driver.findElement(By.cssSelector("[type='text']")).sendKeys("iphone15");
    driver.findElement(By.cssSelector("[class='_2iLD__']")).click();
	}

}
