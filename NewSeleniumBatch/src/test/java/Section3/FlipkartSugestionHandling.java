package Section3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSugestionHandling {

	public static void main(String[] args)  {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.flipkart.com/");
     driver.findElement(By.cssSelector("[class='_30XB9F']")).click();
    driver.findElement(By.name("q")).sendKeys("iphone15");
    
    List<WebElement> ele = driver.findElements(By.cssSelector("[class='oleBil']"));
    for(WebElement r:ele) {
    	if(r.getText().equals("iphone15pro max")) {
    		r.click();
    		break;
    	}
    }
	}

}
