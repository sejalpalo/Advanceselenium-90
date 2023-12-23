package Section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TheInternetSite {

	public static void main(String[] args) {
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.get("https://the-internet.herokuapp.com/iframe");
   //driver.switchTo().frame("mce_0_ifr");
   //or
  driver.switchTo().frame(0);
   //or
   //WebElement ele = driver.findElement(By.id("mce_0_ifr"));
   //driver.switchTo().frame(ele);
   
   String text = driver.findElement(By.xpath("//p[.='Your content goes here.']")).getText();
   System.out.println(text);
   //main frame
   driver.switchTo().defaultContent();
   //find the location for file
   driver.findElement(By.xpath("//span[.='File']")).click();
	}

}

