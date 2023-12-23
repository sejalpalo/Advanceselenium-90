package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAmazon {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     Thread.sleep(2000);
     driver.manage().window().maximize();
     Thread.sleep(2000);
     //Access amazon application
     driver.get("https://www.amazon.in/");
	}

}
