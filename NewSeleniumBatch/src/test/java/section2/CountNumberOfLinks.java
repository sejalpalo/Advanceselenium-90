package section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNumberOfLinks {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver(); 
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.instagram.com/");
    int count=0;
    List<WebElement> Alllinks = driver.findElements(By.tagName("a"));
	for( WebElement r:Alllinks) {
    	String links =  r.getAttribute("href");
    	count++;
    	
    }
	System.out.println(count);
    
	}

}
