package section2;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMBrokenLink {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.findElement(By.name("username")).sendKeys("Admin");
     WebElement ele = driver.findElement(By.name("password"));
    ele.sendKeys("admin123");
    ele.submit();
    String title = driver.getTitle();
    System.out.println(title);
    
    String url = driver.getCurrentUrl();
    System.out.println(url);
    
    List<WebElement> Allimage = driver.findElements(By.tagName("img"));
    for(WebElement r:Allimage) {
    	String image = r.getAttribute("src") ; 
    	System.out.println(image);
    }
    List<WebElement> Alllinks = driver.findElements(By.tagName("a"));
    ArrayList<String> Brokenlinks=new ArrayList<String>();
    for(WebElement r:Alllinks) {
    	String link = r.getAttribute("href");
    	int statuscode=0;
   	try {
			URL url1=new URL(link);
			URLConnection urlconn = url1.openConnection();
			HttpURLConnection httpurl = (HttpURLConnection)urlconn;
			statuscode=httpurl.getResponseCode();
			if(statuscode>=400) {
				Brokenlinks.add(link+" "+ statuscode);
			}
			
		} catch (Exception e) {
			continue;
		}
    }
    System.out.println(Brokenlinks);//there is no broken links in this web page thats why its print []
	}

}
