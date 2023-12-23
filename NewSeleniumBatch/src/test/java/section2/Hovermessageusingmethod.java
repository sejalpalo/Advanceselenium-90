package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hovermessageusingmethod {
	WebDriver driver;
	public void accessBroswer() {
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
	/**
	 * This method perform login action
	 */
	public void login() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	/**
	 * this method return H-over msg
	 * @return
	 */
   public String getHovermsg() {
	   WebElement ele=driver.findElement(By.xpath("//div[@title='Assign Leave']"));
	   String text=ele.getAttribute("title");
	   return text;
	   
   }
}

