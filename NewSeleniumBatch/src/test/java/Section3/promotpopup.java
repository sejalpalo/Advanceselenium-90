package Section3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class promotpopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript("window.location=arguments[0]", "https://licindia.in/");
	      driver.findElement(By.className("login1")).click();
	      Alert alt = driver.switchTo().alert();
	      String text = alt.getText();
	      System.out.println(text);
	     
	      alt.dismiss();
	}

}

