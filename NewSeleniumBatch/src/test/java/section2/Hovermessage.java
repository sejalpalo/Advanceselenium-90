package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hovermessage {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    //print H-over message
    WebElement ele = driver.findElement(By.xpath("//div[@title='Assign Leave']"));
    String text = ele.getAttribute("title");
    System.out.println(text);
	}

}

