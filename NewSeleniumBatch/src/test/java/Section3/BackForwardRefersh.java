package Section3;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackForwardRefersh {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //access amazon
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.location=arguments[0]", "https://www.amazon.in/");
	    //access flipkart
	    js.executeScript("window.location=arguments[0]","https://www.flipkart.com/");
	   //backward
	    Thread.sleep(2000);
		js.executeScript("history.back(0)");
        //forward
		Thread.sleep(2000);
		js.executeScript("history.forward(0)");
		
		//for refersh
		Thread.sleep(2000); 
		js.executeScript("history.go(0)");
	}

}
