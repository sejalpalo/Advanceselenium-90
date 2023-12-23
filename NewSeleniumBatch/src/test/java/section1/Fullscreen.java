package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fullscreen {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");
    Thread.sleep(4000);
    driver.manage().window().maximize();
    Thread.sleep(4000);
    driver.manage().window().minimize();
    Thread.sleep(4000);
    driver.manage().window().fullscreen();
    Thread.sleep(4000);
    driver.manage().window().minimize();
    String title=driver.getTitle();
    System.out.println(title);
    String url=driver.getCurrentUrl();
    System.out.println(url);
    driver.quit();
    
    
    
	}

}
