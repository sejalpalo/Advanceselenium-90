package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.amazon.in/");
  driver.get("https://www.flipkart.com/");
  Thread.sleep(4000);
  driver.navigate().back();
  Thread.sleep(4000);
  driver.navigate().forward();
  Thread.sleep(4000);
  driver.navigate().refresh();
  Thread.sleep(4000);
  driver.close();
  
  
  
  
  
	}

}
