package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yatra {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get(" https://www.yatra.com/");
    //getTitle
    String title=driver.getTitle();
    System.out.println(title);
    Thread.sleep(4000);
    driver.quit();
    
	}

}
