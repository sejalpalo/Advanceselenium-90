package section1;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithOutUsingGetMethod {

	public static void main(String[] args) throws  Throwable {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    //Access amazon
    driver.navigate().to("https://www.amazon.in/"); 
    Thread.sleep(4000);
    //Access flipkart
    URL url=new URL("https://www.flipkart.com/");
    driver.navigate().to(url);
    driver.close();
    
    
	}

}
