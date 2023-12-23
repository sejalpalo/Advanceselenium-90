package section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2 {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.flipkart.com/");
    //remove X
    driver.findElement(By.cssSelector("[class='_30XB9F']")).click();
    driver.findElement(By.cssSelector("[class='Pke_EE']")).sendKeys("iphone15");
    driver.findElement(By.cssSelector("[class='_2iLD__']")).click();
    //print all the product name
    List<WebElement> productname = driver.findElements(By.cssSelector("[class*='rR']"));
    for(WebElement r:productname) {
    	String name=r.getText();
    	System.out.println(name);
    }
	}

}
