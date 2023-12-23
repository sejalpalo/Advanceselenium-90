package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) {
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.get("http://localhost:8888/index.php?action=index&module=Home");
   driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
   driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("password");
   driver.findElement(By.xpath("//input[@type='submit']")).click();
   //click organzation
   driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
   //
   driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
   driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("qspider");
	}

}

