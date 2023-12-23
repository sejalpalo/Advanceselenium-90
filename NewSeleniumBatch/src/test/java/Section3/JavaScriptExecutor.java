package Section3;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //Access amazon
    JavascriptExecutor js =(JavascriptExecutor)driver;
    js.executeScript("window.location=arguments[0]","https://www.amazon.in/");
    
    //access flipkart
    JavascriptExecutor js1 = (JavascriptExecutor)driver;
    js1.executeScript("window.location=arguments[0]", "https://www.flipkart.com/");
	}
                        
		
	}


