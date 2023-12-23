package Section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropBy {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//span[.='✕']")).click();
	    driver.findElement(By.name("q")).sendKeys("iphone15");
	    driver.findElement(By.cssSelector("[class*='iLD']")).click();
	    WebElement ele = driver.findElement(By.xpath("//div[@class='_31Kbhn _28DFQy']//div[@class='_3FdLqY']"));
	    Actions act=new Actions(driver);
	    act.dragAndDropBy(ele, 20, 0).perform();
	}

}
