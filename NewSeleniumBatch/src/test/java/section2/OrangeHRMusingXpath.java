package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMusingXpath {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
    driver.findElement(By.xpath("//button[contains(.,'L')]")).click();
	}

}
