package Section3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestionHandling {

	public static void main(String[] args) throws Throwable {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.google.com/");
    driver.findElement(By.name("q")).sendKeys("virat");
    Thread.sleep(1000);
   List<WebElement> ele = driver.findElements(By.cssSelector("[class='lnnVSe']"));
   for(WebElement r:ele) {
	   if(r.getText().contains("age")) {
		   r.click();
		   break;
	   }
   }
    
	}

}
