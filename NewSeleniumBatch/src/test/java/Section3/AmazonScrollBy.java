package Section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonScrollBy {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.location=arguments[0]","https://www.amazon.in/");
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone15");
    driver.findElement(By.id("nav-search-submit-button")).click();
    WebElement ele = driver.findElement(By.xpath("//span[.='Slate']"));
    int y= ele.getLocation().getY();
    js.executeScript("window.scrollBy(0,"+y+")", ele);
	}

}
