package Section3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class promptup {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript("window.location=arguments[0]", "https://demo.guru99.com/test/simple_context_menu.html");
	     WebElement ele = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
	      Actions ac=new Actions(driver);
	      ac.doubleClick(ele).perform();
	      
	    Alert alt = driver.switchTo().alert();
	    String text = alt.getText();
	    System.out.println(text);
	    
	    Thread.sleep(2000);
	    alt.accept();
	
}

}


