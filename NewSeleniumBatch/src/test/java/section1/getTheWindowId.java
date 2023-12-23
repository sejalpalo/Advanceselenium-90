package section1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTheWindowId {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
     String title = driver.getTitle();
     System.out.println(title);
     //print parent window id
     String pid=driver.getWindowHandle();
     System.out.println(pid);
     
     //print all the window ids
     Set<String> allids = driver.getWindowHandles();
     System.out.println(allids);
     driver.close();
    
     
	}

}
