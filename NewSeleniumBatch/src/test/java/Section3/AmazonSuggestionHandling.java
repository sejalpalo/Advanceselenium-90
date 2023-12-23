package Section3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSuggestionHandling {

	public static void main(String[] args) throws Throwable {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.amazon.in/");
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone15");
    Thread.sleep(1000);
    List<WebElement> element = driver.findElements(By.cssSelector("[class='s-suggestion s-suggestion-ellipsis-direction']"));
    for(WebElement r:element) {
    	if(r.getText().equals("iphone 15pro max")) {
    		r.click();
    		break;
    	}
    }
	}

}
