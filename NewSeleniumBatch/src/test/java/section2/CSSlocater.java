package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSlocater {

	public static void main(String[] args) throws Throwable {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://practicetestautomation.com/practice-test-login/");
    //login
    driver.findElement(By.cssSelector("[name='username']")).sendKeys("student");
    driver.findElement(By.cssSelector("[id*='pas']")).sendKeys("Password123");
    driver.findElement(By.cssSelector("[id*='su']")).click();
    
    
	}

}
