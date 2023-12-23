package section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetwindowDimension {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.youtube.com/");
    Thread.sleep(4000);
    Dimension d=new Dimension(200,400);
    driver.manage().window().setSize(d);
    Thread.sleep(4000);
    driver.quit();
	}

}
