package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new FirefoxDriver();
    Thread.sleep(2000);
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.manage().window().minimize();
    Thread.sleep(2000);                       
    driver.manage().window().maximize();
    Thread.sleep(2000);
    //Access irctc application
    driver.get("https://www.irctc.co.in/");
    
	}

}
