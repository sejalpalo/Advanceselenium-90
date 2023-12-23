package section1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.icicibank.com/");
    driver.manage().window().maximize();
    Thread.sleep(4000);
    Point p=new Point(200,300);
    driver.manage().window().setPosition(p);
    Thread.sleep(4000);
    driver.quit();
    
	}

}
