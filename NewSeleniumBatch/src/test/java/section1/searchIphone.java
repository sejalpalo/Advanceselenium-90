package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchIphone {

	public static void main(String[] args) throws Throwable {
    WebDriver driver=new ChromeDriver();
    Thread.sleep(2000);
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
    WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
    element.sendKeys("iphone14");
    WebElement ele=driver.findElement(By.id("nav-search-submit-button"));
    ele.click();
    
	}

}
