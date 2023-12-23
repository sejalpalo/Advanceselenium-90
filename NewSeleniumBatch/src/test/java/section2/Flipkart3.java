package section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart3 {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.flipkart.com/");
    driver.findElement(By.xpath("//span[.='✕']")).click();
    driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone15");
    driver.findElement(By.xpath("//button[contains(@class,'iL')]")).click();
    //product name
    List<WebElement> name = driver.findElements(By.xpath("//div[contains(@class,'rR')]"));
    //product price
    List<WebElement> price = driver.findElements(By.xpath("//div[contains(@class,'WHN')]"));
    for(int i=0;i<name.size();i++) {
    	String pname=name.get(i).getText();
    	String pprice=price.get(i).getText();
    	System.out.println(pname+"----->"+pprice);
	}
    driver.close();

}
}
