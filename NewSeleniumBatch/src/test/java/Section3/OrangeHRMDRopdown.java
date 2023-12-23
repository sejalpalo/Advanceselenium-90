package Section3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRMDRopdown {

	

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[contains(.,'L')]")).click();
	    driver.findElement(By.xpath("//span[.='Admin']")).click();
	    driver.findElement(By.xpath("//label[.='User Role']/parent::div/following-sibling::div//i")).click();
	    Robot r=new Robot();
	    r.delay(2000);
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	}

}


