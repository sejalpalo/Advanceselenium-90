package Section3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class internetApplication {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript("window.location=arguments[0]", "https://the-internet.herokuapp.com/javascript_alerts");
	      driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
	      Alert alt = driver.switchTo().alert();
	      alt.sendKeys("yes i am prompt");
	      alt.accept();
	}

}
