package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_Broswer {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//wait for 2 second
		Thread.sleep(2000);
		//optimized
		driver.manage().window().maximize();
	}

}
