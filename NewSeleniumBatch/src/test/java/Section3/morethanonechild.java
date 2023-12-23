package Section3;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class morethanonechild {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.flipkart.com/");
     driver.findElement(By.xpath("//span[.='✕']")).click();
     driver.findElement(By.name("q")).sendKeys("iphone15");
     driver.findElement(By.cssSelector("[class='_2iLD__']")).click();
     driver.findElement(By.xpath("//div[.='APPLE iPhone 15 (Blue, 128 GB)']")).click();
     //by using title
    /*Set<String> allid = driver.getWindowHandles();
    for(String r:allid) {
    	String title = driver.switchTo().window(r).getTitle();
    	if(title.equals("APPLE iPhone 15 (Blue, 128 GB)")) {
    		break;
    	}
    }
     String text = driver.findElement(By.xpath("//span[.='APPLE iPhone 15 (Blue, 128 GB)']")).getText();
     System.out.println(text);*/
     
     //by using url
    /* Set<String> allid = driver.getWindowHandles();
     for(String r:allid) {
    	 String url = driver.switchTo().window(r).getCurrentUrl();
    	 if(url.contains("https://www.flipkart.com/apple-iphone-15-green-128-gb/")) {
    		 break;
    	 }
    		 
     }
     String text = driver.findElement(By.xpath("//span[.='APPLE iPhone 15 (Blue, 128 GB)']")).getText();
     System.out.println(text);*/
     
     //by using id
     String pid = driver.getWindowHandle();
    Set<String> allid = driver.getWindowHandles();
    for(String r:allid) {
    	if(!(pid.equals(r))) {
    		driver.switchTo().window(r);
    	}
    }
    String text = driver.findElement(By.xpath("//span[.='APPLE iPhone 15 (Blue, 128 GB)']")).getText();
    System.out.println(text);

    
     
	}

}

