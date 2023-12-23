package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessAmazonapp {

	public static void main(String[] args) throws Throwable {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.instagram.com/");
//    WebElement ele = driver.findElement(By.name("username"));
//    ele.sendKeys("sejalpalo");
    Thread.sleep(2000);
    //pass the username
  driver.findElement(By.name("username")).sendKeys("sejalpalo");
  //pass the password
    WebElement element= driver.findElement(By.name("password"));
    element.sendKeys("Suraj@123");
    //login
    element.submit();
    
	}

}
