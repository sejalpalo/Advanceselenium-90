package Section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class amazonmobile {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.amazon.in/");
    driver.findElement(By.xpath("//a[.='Mobiles']")).click();
    WebElement ele = driver.findElement(By.linkText("Laptops & Accessories"));
    Actions act=new Actions(driver);
    act.moveToElement(ele).perform();
    driver.findElement(By.xpath("//a[.='Dell']/parent::li/following-sibling::li//a[.='HP']")).click();
    WebElement drop = driver.findElement(By.name("s"));
    Select se=new Select(drop);
    se.selectByVisibleText("Price: Low to High");
   WebElement ele1 = driver.findElement(By.xpath("//a[.='Price: Low to High']"));
   act.click(ele1).perform();
    
	}

}

