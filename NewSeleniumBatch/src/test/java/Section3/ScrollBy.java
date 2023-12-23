package Section3;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //Access amazon
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.location=arguments[0]", "https://www.amazon.in/");
	    
	    
	    js.executeScript("window.scrollBy(0,600)");
	    Thread.sleep(4000);
	    js.executeScript("window.scrollBy(0,-600)");
	    
	}

}
