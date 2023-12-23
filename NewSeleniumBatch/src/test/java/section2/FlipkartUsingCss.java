package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartUsingCss {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.flipkart.com/");
   WebElement ele = driver.findElement(By.cssSelector("[class='_30XB9F']"));
  
    ele.click();
   WebElement elements = driver.findElement(By.cssSelector("[type='text']"));
    elements.sendKeys("iphone15");
    elements.submit();
    
    
    
    
	}

}
