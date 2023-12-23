package section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchElements {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.amazon.in");
    List<WebElement> Alllinks = driver.findElements(By.tagName("a"));
    for(WebElement r:Alllinks) {
    	//for links
    	String links=r.getAttribute("href");
    	System.out.println(links);
    	//for linktext
    	String linktext=r.getText();
    	System.out.println(linktext);
    	
    }

	
	}

}
