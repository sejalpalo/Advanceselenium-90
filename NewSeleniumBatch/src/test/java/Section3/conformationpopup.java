package Section3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class conformationpopup {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript("window.location=arguments[0]", "https://www.amazon.in/"); 
	      js.executeScript("confirm()");
	      Thread.sleep(2000);
	      
	      Alert alt = driver.switchTo().alert();
	      alt.dismiss();
	}

}


