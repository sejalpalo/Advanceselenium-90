package section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAllTheImage {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.instagram.com/");
    //fetch image and imagename using tagname
    List<WebElement> Allimage = driver.findElements(By.tagName("img"));
    for(WebElement r:Allimage) {
    	String ele = r.getAttribute("src") ;  
    	System.out.println(ele);
    	
    	
	}

}
}
