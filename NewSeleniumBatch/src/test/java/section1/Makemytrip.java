package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    Thread.sleep(4000);
    driver.manage().window().minimize();
    Thread.sleep(4000);
    driver.manage().window().maximize();
    driver.get("https://www.makemytrip.com/");
    Thread.sleep(4000);
    //close the broswer
    driver.quit();
    
    
	}
}
