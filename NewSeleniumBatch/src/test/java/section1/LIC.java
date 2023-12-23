package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LIC {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://licindia.in/");
    Thread.sleep(4000);
    String title=driver.getTitle();
    System.out.println(title);
    Thread.sleep(4000);
    //get the url
    String url=driver.getCurrentUrl();
    System.out.println(url);
    driver.manage().window().minimize();
    driver.quit();
    
	}

}
