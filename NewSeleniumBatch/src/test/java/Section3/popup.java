package Section3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) throws Throwable {
    WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("window.location=arguments[0]", "https://www.amazon.in/");
      //create alert popup
      js.executeScript("alert()");
      
     TargetLocator tg = driver.switchTo();
      Alert act = tg.alert();
      
      Thread.sleep(2000);
      //click ok
     act.accept();
      
	}

}
